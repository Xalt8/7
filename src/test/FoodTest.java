package test;

import static org.junit.Assert.*;

import org.junit.Test;

import coffeeShop.*;

public class FoodTest {

	@Test
	public void testGetFoodID() {
		String expected1 = "O001";
		String message1 = "Failed for ID: O001";
		Food prawns = new Food("O001","Prawn Crackers","Other",0.5);
	    String actual1 = prawns.getFoodID();
		assertEquals(message1, expected1, actual1);
	}

	@Test
	public void testGetFoodName() {
		String expected1 = "Prawn Crackers";
		String message1 = "Failed for name: prawn crackers";
		Food prawns = new Food("O001","Prawn Crackers","Other",0.5);
	    String actual1 = prawns.getFoodName();
		assertEquals(message1, expected1, actual1);
	}
	
	@Test
	public void testGetFoodCategory() {
		String expected1 = "Other";
		String message1 = "Failed for category: Other";
		Food prawns = new Food("O001","Prawn Crackers","Other",0.5);
	    String actual1 = prawns.getFoodCategory();
		assertEquals(message1, expected1, actual1);
	}
	
	@Test
	public void testGetPrice() {
		double expected1 = 0.5;
		String message1 = "Failed for price: 0.5 EUR";
		Food prawns = new Food("O001","Prawn Crackers","Other",0.5);
	    double actual1 = prawns.getPrice();
		//assertEquals(message1, expected1, actual1);
	    assertTrue(actual1==expected1);
	}
}
