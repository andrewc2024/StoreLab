public class Arduino extends ElectronicItem{
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Arduino(Integer storageCapacity, String model, String maker, String operatingSystem, String version) {
        super(storageCapacity, model, maker, operatingSystem);
        this.version = version;
    }

    @Override
    public String toString() {
        return "Arduino{" +
                "version='" + version + '\'' +
                '}';
    }
}
