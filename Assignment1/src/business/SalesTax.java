/**
 * @class SalesTax
 * @author chahat
 * @created 09-04-2021
 * @updated by chahat
 * @description SalesTax class calculates the tax of each item depending upon its type.
 */



package business;
import java.util.ArrayList;


public class SalesTax{ 
	
	SalesTax(ArrayList<Item> list){
		try {
		for(int i=0; i<list.size(); i++)
		{
	    
		
		double salesTax=0.0d;
		double finalPrice=0.0d;
		
		
		if(list.get(i).getItemType().equalsIgnoreCase("Raw"))
			salesTax += (12.5 * list.get(i).getItemPrice())/100;
		else if(list.get(i).getItemType().equalsIgnoreCase("Manufactured"))
			salesTax += (12.5 * list.get(i).getItemPrice())/100 + 2*(list.get(i).getItemPrice() + (12.5 * list.get(i).getItemPrice())/100)/100;
		else if(list.get(i).getItemType().equalsIgnoreCase("Imported")) {
			salesTax += (12.5 * list.get(i).getItemPrice())/100 + (10*list.get(i).getItemPrice())/100;
			if (salesTax <= 100)
				salesTax += 5;
			else if(salesTax>100 && salesTax<=200)
				salesTax += 10;
			else
				salesTax += (5* salesTax)/100;
		}
		else {
			throw new InvalidTypeException("Invalid Item Type");
		}
		finalPrice = (list.get(i).getItemPrice() + salesTax)*list.get(i).getItemQuantity();
		
		
		System.out.println("Item Name: "+ list.get(i).getItemName());
		System.out.println("Item price: "+ list.get(i).getItemPrice());
		System.out.println("Item Quantity: "+ list.get(i).getItemQuantity());
		System.out.println("Sales tax liability per item: "+ salesTax);
		System.out.println("Final price: "+ finalPrice);
		System.out.println("\t");
		
		}		
	}
		
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
		}
	
}

	
	
