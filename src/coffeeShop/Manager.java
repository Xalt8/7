package coffeeShop;

import coffeeShop.interfaces.BasketOpsListener;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Set;

public class Manager implements BasketOpsListener {
	
	private  Inventory inventory = new Inventory();
	private  Basket basket;
	private  void addFoodItems(){

		BufferedReader buff = null;

		try 
		{
			buff = new BufferedReader(new FileReader("fooditems.csv"));
			String inputline = buff.readLine();
			while(inputline != null) 
			{
				Item i = processline(inputline);
				inventory.addItem(i, 10); //  10 default quantity
				inputline = buff.readLine();
			}
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
			System.exit(1);
		}
		catch (IOException e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		finally 
		{
			try {buff.close();}
			catch (IOException ioe) {}
		}
	}

	private static Item processline(String inputLine) {
		String data[] = inputLine.split(",");
		double costOfItem = Double.parseDouble(data[3]);
		Item newItem = null;
		if(data[2] == "Beverage"){
			double volume = Double.parseDouble(data[5]);
			newItem = new Drink(data[0], costOfItem, data[1], data[2], volume);
			Inventory inventory = new Inventory();
			int itemQuantity = Integer.parseInt(data[6]);
			inventory.addItem(newItem, itemQuantity);		
		}
		else if(data[2] == "Food"){
			//TODO parse date on data[5]
			newItem = new Food(data[0], costOfItem, data[1],data[2], Calendar.getInstance().getTime());
			Inventory inventory = new Inventory();
			int itemQuantity = Integer.parseInt(data[6]);
			inventory.addItem(newItem, itemQuantity);
		}
		else if(data[2]=="Other") {
			newItem = new Other(data[0],costOfItem, data[1],data[2]);
			Inventory inventory = new Inventory();
			int itemQuantity = Integer.parseInt(data[5]);
			inventory.addItem(newItem, itemQuantity);
		}
		return newItem;
	}

	public void run(){
		addFoodItems();
		basket = new Basket(this);
	}

	@Override
	public void onBasketUpdate() {
		//TODO Update inventory
	}

	@Override
	public void onBasketAdd() {

	}

	@Override
	public void onBasketRemove() {

	}
}

