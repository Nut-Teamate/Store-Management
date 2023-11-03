/**
 * This class represents a clothing item object
 * @author Cayden Liao
 * @version 1.0
 */
public class ClothingItem {
	/**
	* Initialize ClothingItem attributes of color and price
	*/
	private String color;
	private double price;

	/**
	* Returns the color attribute value of the TShirt 
	* @return The value of the color variable as a String
	*/
	//public String getColor() {
	//	return color;
	//}

	/**
	* Returns the price attribute value of the TShirt 
	* @return The value of the price variable as a String
	*/
	public double getPrice() {
		return price;
	}

	/**
	* Returns ClothingItem's attributes into a nicely formatted string
	* @return The attributes of the ClothingItem objects in a String
	*/
	public String toString() {
		return "Color: " + color + "\nPrice: " + price;
	}

	/**
	* Parameterized Constructor for a ClothingItem with an adjustable color price
	* @param color The color of the ClothingItem
	* @param price The price of the ClothingItem
	*/
	public ClothingItem(String color, double price) {
		this.color = color;
		this.price = price;
	}
}