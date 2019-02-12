package coffeeShop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Manager {

	private static Inventory inventory;
	
	private  static void addFoodItems(){

		BufferedReader buff = null;

		try 
		{
			buff = new BufferedReader(new FileReader("fooditems.txt"));
			String inputline = buff.readLine();
			while(inputline != null) 
			{
				Food f = processline(inputline);
				inventory.addFood(f, 10); // default quantity for now
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

	private static Food processline(String inputLine) 
	{
		String data[] = inputLine.split(",");
		double costOfItem = Double.parseDouble(data[3]);
		Food f = new Food(data[0],data[1],data[2],costOfItem);
		String a = String.format("%-10s", f.getFoodCategory());
		String b = String.format("%-6s", f.getFoodID());
		String c = String.format("%-17s", f.getFoodName());
		String d = String.format("%3.2f", f.getPrice());
		return f;
		//System.out.println("ID: " + b + "Name: " + c + "Category: " + a + "Price: " + d +" GBP" );
		//Inventory inventory = new Inventory();
	}

	public static void main(String[] args) {
		inventory = new Inventory();
		inventory.getItemList().keySet();
		addFoodItems();
	}

}