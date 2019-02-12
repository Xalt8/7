package coffeeShop;

import java.util.TreeMap;

public class Inventory{
	private TreeMap<Food,Integer> inventory;
	//private Order order;
	private Manager manager;
	
	public Inventory() {
		this.inventory = new TreeMap<>();
		inventory.put(Food, 10);
		this.manager = manager;
		
	}
	
	
	public void addFood(Food food, int quantity) {
		inventory.put(food, quantity);
	}
	
	
	public TreeMap<Food,Integer> getItemList(){
		return inventory;
	}
	
	public void checkUpdateInventory(Order order,boolean subtracting) {
		
	}
	
}