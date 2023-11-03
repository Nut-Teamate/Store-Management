public class TShirt extends ClothingItem {
	/**
	* Initialize TShirt attributes of size, frontDesign, and backDesign
	*/
	private String size;
	private String frontDesign;
	private String backDesign;

	/**
	* Returns the size attribute value of the TShirt 
	* @return The value of the size variable as a String
	*/
	public String getSize() {
		return size;
	}

	/**
	* Returns the frontDesign attribute value of the TShirt 
	* @return The value of the frontDesign variable as a String
	*/
	public String getFrontDesign() {
		return frontDesign;
	}

	/**
	* Returns the backDesign attribute value of the TShirt 
	* @return The value of the backDesign variable as a String
	*/
	public String getBackDesign() {
		return backDesign;
	}

	/**
	* Returns TShirt's attributes into a nicely formatted string along with its 
	* color and price inherited from the superclass
	* @return The attributes of the TShirt objects in a String
	*/
	public String toString() {
		return "T-Shirt:\n----------\n" + super.toString() + "\nSize: " + size + "\nFront Design: " + frontDesign + "\nBack Design: " + backDesign;
	}

	/**
	* No argument Constructor for TShirt with its color as white, 
	* price as 10, size as M, frontDesign as Plain, and backDesign as Plain
	*/
	public TShirt() {
		super("White", 10.0);
		size = "M";
		frontDesign = "Plain";
		backDesign = "Plain";
	}

	/**
	* Parameterzied Constructor for TShirt with its color as white, 
	* price as 10 and other attributes to the user's desire
	* @param size The size of the TShirt
	* @param frontDesign The front design of the TShirt
	* @param backDesign The back design of the TShirt
	*/
	public TShirt(String size, String frontDesign, String backDesign) {
		super("White", 10.0);
		this.size = size;
		this.frontDesign = frontDesign;
		this.backDesign = backDesign;
	}

	/**
	* Fully parameterized Constructor for TShirt that allows control over all attributes
	* @param color The color of the TShirt
	* @param price The price of the TShirt
	* @param size The size of the TShirt
	* @param frontDesign The front design of the TShirt
	* @param backDesign The back design of the TShirt
	*/
	public TShirt(String color, double price, String size, String frontDesign, String backDesign) {
		super(color, price);
		this.size = size;
		this.frontDesign = frontDesign;
		this.backDesign = backDesign;
	}

}