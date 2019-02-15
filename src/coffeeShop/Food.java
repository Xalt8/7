package coffeeShop;

import java.util.Calendar;
import java.util.Date;

public class Food extends Item{

	private Date expireDate;

	public Food(String itemId, Double price, String name, String description, Date expireDate) {
		super(itemId, price, name, description);
		this.expireDate = expireDate;
	}
	//TODO modify return String
	public Date getExpireDate() {
		return expireDate;
	}
}