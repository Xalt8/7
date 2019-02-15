package coffeeShop.exceptions;

public class InventoryItemNotFound extends Exception{
    public InventoryItemNotFound() {
        super("Item not found int the inventory");
    }
}
