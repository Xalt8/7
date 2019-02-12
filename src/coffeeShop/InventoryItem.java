package coffeeShop;

public class InventoryItem {
    private Food food;
    private Integer quantity;

    public InventoryItem(Food food, Integer quantity) {
        this.food = food;
        this.quantity = quantity;
    }

    public Food getFood() {
        return food;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
