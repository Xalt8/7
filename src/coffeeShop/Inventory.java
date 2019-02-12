package coffeeShop;

import java.util.TreeMap;

public class Inventory {

	private TreeMap<String, Food> itemList = new TreeMap<String, Food>();
	private TreeMap<String, Integer> quantities = new TreeMap<String, Integer>();

	public void addItem(Food item, int quantity) {
		itemList.put(item.getFoodID(), item);
		quantities.put(item.getFoodID(), quantity);
	}
	
	public Food getItem(String itemID) {
		return itemList.get(itemID);
	}
	
	public void checkUpdateInventory(Order order) {
		// TODO: implementation + throw exception if out of item requested
	}

	public TreeMap<String, Food> getItemList() {
		return itemList;
	}
	
	public TreeMap<String, Integer> getQuantities() {
		return quantities;
	}

	
}
