import java.util.ArrayList;

public class Store {

    private static ArrayList<CISItem> items = new ArrayList<>();

    public static void addBooks(Book x){
        items.add(x);
    }

    public static void updatePhonesLocation(String location) {
        for(int i = 0; i < items.size(); i++){
            if (items.get(i) instanceof Phone){
                items.get(i).setLocation(location);
            }
        }

    }
    public static ArrayList<Phone> getAllPhones(){
        ArrayList<Phone> phones = new ArrayList<>();
        for(int i = 0; i < items.size(); i++){
            if (items.get(i) instanceof Phone){
                phones.add((Phone) items.get(i));
            }
        }
        return phones;
    }

    public static void updateItems(String itemType, String property, String value){
        if(itemType.equalsIgnoreCase("phone")){
            for(int i = 0; i < items.size(); i++){
                if (items.get(i) instanceof Phone){
                    if(property.equalsIgnoreCase("networktype")){
                        ((Phone) items.get(i)).setNetworkType(value);
                    }
                    if(property.equalsIgnoreCase("screensize")){
                        ((Phone) items.get(i)).setScreenSize(Integer.valueOf(value));
                    }
                }
            }
        }else if(itemType.equalsIgnoreCase("book")){
            for(int i = 0; i < items.size(); i++){
                if (items.get(i) instanceof Book){
                    if(property.equalsIgnoreCase("isbn")){
                        ((Book) items.get(i)).setIsbn(value);
                    }
                    if(property.equalsIgnoreCase("edition")){
                        ((Book) items.get(i)).setEdition(value);
                    }
                    if(property.equalsIgnoreCase("title")){
                        ((Book) items.get(i)).setTitle(value);
                    }
                }
            }
        }else if(itemType.equalsIgnoreCase("arduino")){
            for(int i = 0; i < items.size(); i++){
                if (items.get(i) instanceof Arduino){
                    ((Arduino) items.get(i)).setVersion(value);
                }
            }
        }else if(itemType.equalsIgnoreCase("magazine")){
            for(int i = 0; i < items.size(); i++){
                if (items.get(i) instanceof Magazine){
                    if(property.equalsIgnoreCase("coverstory")){
                        ((Magazine) items.get(i)).setCoverStory(value);
                    }
                    if(property.equalsIgnoreCase("printdate")){
                        ((Magazine) items.get(i)).setPrintDate(value);
                    }
                }
            }
        } else {
            System.out.println("not an actual item type");
        }
    }

    public static ArrayList<CISItem> getItems(String type){
        ArrayList<CISItem> reply = new ArrayList<>();
        if(type.equalsIgnoreCase("phone")){
            for(int i = 0; i < items.size(); i++){
                if (items.get(i) instanceof Phone){
                    reply.add(items.get(i));
                }
            }
        }else if(type.equalsIgnoreCase("book")){
            for(int i = 0; i < items.size(); i++){
                if (items.get(i) instanceof Book){
                    reply.add(items.get(i));
                }
            }
        }else if(type.equalsIgnoreCase("arduino")){
            for(int i = 0; i < items.size(); i++){
                if (items.get(i) instanceof Arduino){
                    reply.add(items.get(i));
                }
            }
        }else if(type.equalsIgnoreCase("magazine")){
            for(int i = 0; i < items.size(); i++){
                if (items.get(i) instanceof Magazine){
                    reply.add(items.get(i));
                }
            }
        } else {
            System.out.println("not an actual item type");
        }

        return reply;
    }

    public static void showAllInfo(){
        System.out.println(items.toString());
    }

    public static void addPhones(Phone x){
        items.add(x);
    }

    public Store() {

    }

    public static ArrayList<CISItem> getItemsStoreArrayList() {
        return items;
    }
}

