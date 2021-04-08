
/**
 * @class Item
 * @author chahat
 * @created 09-04-2021
 * @updated by chahat
 * @description Item class contains getter and setter methods.
 *
 */
package business;


public class Item {
	public String itemName, itemType;
	public float itemPrice;
	public int itemQuantity;
	
	public Item(String itemName, String itemType, float itemPrice, int itemQuantity) {
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}


}