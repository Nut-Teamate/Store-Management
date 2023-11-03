public class ClothingItem {
	/*
	Initialize ClothingItem attributes of color and price
	*/
	private String color;
	private double price;

	/*
	Returns the color attribute value of the ClothingItem 
	*/
	public String getColor() {
		return color;
	}

	/*
	Returns the price attribute value of the ClothingItem 
	*/
	public double getPrice() {
		return price;
	}

	/*
	Returns ClothingItem's attributes into a nicely formatted string
	*/
	public String toString() {
		return "Color: " + color + "\nPrice: " + price;
	}

	/*
	No-argument Constructor for a ClothingItem with a white color and a price of 10
	*/
	public ClothingItem() {
		color = "white";
		price = 10.0;
	}

	/*
	Parameterized Constructor for a ClothingItem with an adjustable color price
	*/
	public ClothingItem(String color, double price) {
		this.color = color;
		this.price = price;
	}
}