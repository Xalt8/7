package coffeeShop;

import java.sql.Timestamp;

public class Order {

	private String customerID;
	private int quantity;
	private Timestamp timestamp;
	private Food food;

	public Order(String customerID, int quantity, Timestamp timestamp, Food food) {
		this.customerID = customerID;
		this.quantity = quantity;
		this.timestamp = timestamp;
		this.food = food;
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

	public Food getFood() {
		return food;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;

	}

}