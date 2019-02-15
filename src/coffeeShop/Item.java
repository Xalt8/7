package coffeeShop;

public abstract class Item {
    private String itemId;
    private Double price;
    private String name;
    private String description;

    public Item(String itemId, Double price, String name, String description) {
        this.itemId = itemId;
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public String getItemId() {
        return itemId;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
