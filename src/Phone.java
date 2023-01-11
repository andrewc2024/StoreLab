public class Phone extends ElectronicItem{

    private String networkType;
    private Integer screenSize;

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public Integer getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Integer screenSize) {
        this.screenSize = screenSize;
    }

    public Phone(Integer storageCapacity, String model, String maker, String operatingSystem, String networkType, Integer screenSize) {
        super(storageCapacity, model, maker, operatingSystem);
        this.networkType = networkType;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "networkType='" + networkType + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}
