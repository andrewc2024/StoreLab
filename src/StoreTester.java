import java.util.ArrayList;

public class StoreTester {
    public static void main(String[] args){
        Store testing = new Store();
        tests(testing);
        testing.showAllInfo();
    }

    public static void tests(Store testing){
        Book itemToAddBook = new Book("testing1","edition1","testbook");
        Phone itemToAddPhone = new Phone(128,"11","apple","IOS","4G",12);
        try {
            testing.addBooks(itemToAddBook);
            if (testing.getItemsStoreArrayList().contains(itemToAddBook)){
                System.out.println("Successfully added book");
            }else {
                System.out.println("failed to add");
            }

        }catch (Exception err){
            System.out.println("fail add book");
        }
        try {
            testing.addPhones(itemToAddPhone);
            if (testing.getItemsStoreArrayList().contains(itemToAddPhone)){
                System.out.println("Successfully added phone");
            }else {
                System.out.println("failed to add");
            }
        }catch (Exception err){
            System.out.println("fail add phone");
        }
        try {
            testing.updatePhonesLocation("Room 514");
            for (int i = 0; i < testing.getItemsStoreArrayList().size(); i++){
                if (testing.getItemsStoreArrayList().get(i) instanceof Phone){
                    if (!testing.getItemsStoreArrayList().get(i).getLocation().equalsIgnoreCase("Room 514")){
                        System.out.println("Location has not been changed");
                    }
                }
            }
            System.out.println("All locations have been changed");
        }catch (Exception err){
            System.out.println("fail update locations");
        }
        try {
            ArrayList<Phone> reply = testing.getAllPhones();
            int count = 0;
            for (int i = 0; i < testing.getItemsStoreArrayList().size(); i++){
                if (testing.getItemsStoreArrayList().get(i) instanceof Phone){
                    count++;
                }
            }
            if (!(count == reply.size())){
                System.out.println("didn't retrieve all phones");
            }else {
                System.out.println("Successfully retrieved all phones");
            }


        }catch (Exception err){
            System.out.println("fail get phones");
        }
        try {

            ArrayList<CISItem> reply = testing.getItems("book");
            int count = 0;
            for (int i = 0; i < testing.getItemsStoreArrayList().size(); i++){
                if (testing.getItemsStoreArrayList().get(i) instanceof Book){
                    count++;
                }
            }
            if (count != reply.size()){
                System.out.println("didn't retrieve all items");
            }else {
                System.out.println("Successfully retrieved all items");
            }


        }catch (Exception err){
            System.out.println("cmd failed");
        }
        try {
            testing.updateItems("phone","screensize","12");
            int count = 0;
            for (int i = 0; i < testing.getItemsStoreArrayList().size(); i++){
                if (testing.getItemsStoreArrayList().get(i) instanceof Phone){
                    if (((Phone) testing.getItemsStoreArrayList().get(i)).getScreenSize() == 12){
                        count++;
                    }
                }
            }
            int trueCount = 0;
            for (int i = 0; i < testing.getItemsStoreArrayList().size(); i++){
                if (testing.getItemsStoreArrayList().get(i) instanceof Phone){
                    trueCount++;
                }
            }
            if(trueCount == count){
                System.out.println("Successfully updated all items");
            }else {
                System.out.println("failed to update all items");
            }



        }catch (Exception err){
            System.out.println("cmd failed");
        }



    }

}
