package coffeeShop;

import java.sql.Timestamp;

public class Order {

	private String customerID;
	private int quantity;
	private Timestamp timestamp;
	private Item item;

	public Order(String customerID, int quantity, Timestamp timestamp, Item item) {
		this.customerID = customerID;
		this.quantity = quantity;
		this.timestamp = timestamp;
		this.item = item;
	}

	public String getCustomerID() {
		return customerID;
	}

	public int getQuantity() {
		return quantity;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public Item getItem() {
		return item;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;

	}

}