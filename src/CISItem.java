public class CISItem {
    private String name = "default";
    private String location = "";
    private String description = "";

    @Override
    public String toString() {
        return "CISItem{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    private Integer price = 0;
    public CISItem() {
        this.name = name;
        this.location = location;
        this.description = description;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public CISItem(String name, String location, String description, Integer price) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.price = price;
    }
}
