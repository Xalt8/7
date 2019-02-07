package coffeeShop;

public class Food{
	
	private String foodID;
	private String foodName;
	private String foodCategory;
	private double price;
	
	public Food(String foodID,String foodName,String foodCategory,double price) {
		this.foodID = foodID;
		this.foodName = foodName;
		this.foodCategory = foodCategory;
		this.price = price;
	}
	
	public String getFoodID() {
		return foodID;
	}
	
	public String getFoodName() {
		return foodName;
	}
	
	public String getFoodCategory() {
		return foodCategory;
	}
	
	public double getPrice() {
		return price;
	}
	
}