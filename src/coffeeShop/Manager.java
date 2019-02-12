package coffeeShop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Manager {

	private  static void addFoodItems(){

		BufferedReader buff = null;

		try 
		{
			buff = new BufferedReader(new FileReader("fooditems.csv"));
			String inputline = buff.readLine();
			while(inputline != null) 
			{
				processline(inputline);
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

	private  static void processline(String inputLine) 
	{
		String data[] = inputLine.split(",");
		double costOfItem = Double.parseDouble(data[3]);
		Food f = new Food(data[0],data[1],data[2],costOfItem);
		System.out.println(f);
	}

	public static void main(String[] args) {
	
		addFoodItems();
	}

}

