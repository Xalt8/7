package coffeeShop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

public class Manager {
	
	private static Inventory inventory = new Inventory();

	private  static void addFoodItems(){

		BufferedReader buff = null;

		try 
		{
			buff = new BufferedReader(new FileReader("fooditems.csv"));
			String inputline = buff.readLine();
			while(inputline != null) 
			{
				Food f = processline(inputline);
				inventory.addItem(f, 10); //  10 default quantity
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
		return f;
	}

	public static void main(String[] args) {
		addFoodItems();
//		Set<String> keys = inventory.getItemList().keySet();
//		for (String k : keys) {
//			System.out.println(k);
//			System.out.println(inventory.getItem(k).getFoodName() + "\n");
//		}
	}

}

