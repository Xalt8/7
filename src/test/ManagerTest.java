package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import coffeeShop.Item;
import coffeeShop.Manager;

class ManagerTest {

	
	@Test
	void testAddFoodItems() {
		{
		BufferedReader buff = null;

		try 
		{
			buff = new BufferedReader(new FileReader("fooditems.csv"));
			
			String inputline = buff.readLine();
			while(inputline != null) 
			{
//				Manager.processline(inputline);
//				inputline = buff.readLine();
			}
		} 
		catch (FileNotFoundException e) 
		{
			assertTrue (e.getMessage().contains("File not found"));	
		}
		catch (IOException e)
		{
			assertTrue(e.getMessage().contains("Input Output exception"));
		}
		finally 
		{
			try {buff.close();}
			catch (IOException ioe) 
			{
				assertTrue(ioe.getMessage().contains("Input output close exception"));
			}
		}
	}
}
	@Test
	void testprocessLine() {
		
	}
}

	
	

