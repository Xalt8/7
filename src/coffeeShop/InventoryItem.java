package coffeeShop;

public class InventoryItem {
    private Item item;
    private Integer quantity;

    public InventoryItem(Item item, Integer quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
