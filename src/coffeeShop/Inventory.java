package coffeeShop;

import coffeeShop.exceptions.InventoryItemNotFound;

import java.util.TreeMap;

public class Inventory {

	private TreeMap<String, InventoryItem> inventory = new TreeMap<>();

	public void addItem(Item item, Integer quantity) {
		inventory.put(item.getItemId(), new InventoryItem(item,quantity));
	}
	
	public InventoryItem getItem(String itemID) {
		return inventory.get(itemID);
	}
	
	public void checkUpdateInventory(Order order) {
		// TODO: implementation + throw exception if out of item requested
	}
	// TODO get rid of this?
	public TreeMap<String, InventoryItem> getInventory() {
		return inventory;
	}

	public InventoryItem searchItem(String id) throws InventoryItemNotFound {
		if(inventory.containsKey(id)){
			return inventory.get(id);
		}else{
			throw new InventoryItemNotFound();
		}
	}
}
