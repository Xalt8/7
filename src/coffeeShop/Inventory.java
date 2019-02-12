package coffeeShop;

import java.util.TreeMap;

public class Inventory {

	private TreeMap<String, InventoryItem> inventory = new TreeMap<>();

	public void addItem(Food food, int quantity) {
		inventory.put(food.getFoodID(), new InventoryItem(food,quantity));
	}
	
	public InventoryItem getItem(String itemID) {
		return inventory.get(itemID);
	}
	
	public void checkUpdateInventory(Order order) {
		// TODO: implementation + throw exception if out of item requested
	}

	public TreeMap<String, InventoryItem> getInventory() {
		return inventory;
	}
	
}
