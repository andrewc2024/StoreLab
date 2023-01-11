public class ElectronicItem extends CISItem{

    private Integer storageCapacity = 0;

    private String model = "";

    private String maker = "";
    private String operatingSystem = "";

    public Integer getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public ElectronicItem(Integer storageCapacity, String model, String maker, String operatingSystem) {
        this.storageCapacity = storageCapacity;
        this.model = model;
        this.maker = maker;
        this.operatingSystem = operatingSystem;
    }
    public ElectronicItem() {

    }

    @Override
    public String toString() {
        return "ElectronicItem{" +
                "storageCapacity=" + storageCapacity +
                ", model='" + model + '\'' +
                ", maker='" + maker + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
