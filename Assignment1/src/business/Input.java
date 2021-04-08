/**
 * @class Input
 * @author chahat
 * @created 09-04-2021
 * @updated by chahat
 * @description Input class takes the details of each item from tha user
 *
 */

package business;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Input {
	ArrayList<Item> list = new ArrayList<>();

	
	/**
	 * @param null
	 * @return null
	 */
	public void inputs(){
		
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		String itemName, itemType;
		float itemPrice;
		int itemQuantity;
		char ans;
		
			
		do {
		
		//Taking user inputs for each values	
		try {	
		System.out.println("Enter item name: ");
		itemName = sc.next();
		
	
		System.out.println("Enter item price: ");
		itemPrice = sc.nextFloat();
		
		System.out.println("Enter item quantity: ");
		itemQuantity = sc.nextInt();
		
		System.out.println("Enter item type: ");
		itemType = sc.next();
		
		
		Item item = new Item(itemName, itemType, itemPrice, itemQuantity);
		list.add(item);
		
		}
		
		catch(InputMismatchException e) {
			System.out.println("Enter valid data");
			ans = sc.next().charAt(0);
		}

		finally {
		System.out.print("Do you want to enter details of any other item? (y/n)");
		ans = sc.next().charAt(0);
		
		System.out.println("\t");
		}
		}while(ans == 'y');
		
		
	}
	
	
	public void getList(){
		SalesTax st = new SalesTax(list);
		
	}
	
	
   
}   

