public class TShirt extends ClothingItem {
	/*
	Initialize TShirt attributes of size, frontDesign, and backDesign
	*/
	private String size;
	private String frontDesign;
	private String backDesign;

	/*
	Returns the size attribute value of the TShirt 
	*/
	public String getSize() {
		return size;
	}

	/*
	Returns the frontDesign attribute value of the TShirt 
	*/
	public String getFrontDesign() {
		return frontDesign;
	}

	/*
	Returns the backDesign attribute value of the TShirt 
	*/
	public String getBackDesign() {
		return backDesign;
	}

	/*
	Returns TShirt's attributes into a nicely formatted string along with its color and price inherited from the superclass
	*/
	public String toString() {
		return "T-Shirt:\n----------\n" + super.toString() + "\nSize: " + size + "\nFront Design: " + frontDesign + "\nBack Design: " + backDesign;
	}

	/*
	No argument Constructor for TShirt with its color as white, price as 10, size as M, frontDesign as Plain, and backDesign as Plain
	*/
	public TShirt() {
		super("White", 10.0);
		size = "M";
		frontDesign = "Plain";
		backDesign = "Plain";
	}

	/*
	Parameterzied Constructor for TShirt with its color as white, price as 10 and other attributes to the user's desire
	*/
	public TShirt(String size, String frontDesign, String backDesign) {
		super("White", 10.0);
		this.size = size;
		this.frontDesign = frontDesign;
		this.backDesign = backDesign;
	}

	/*
	Fully parameterized Constructor for TShirt that allows control over all attributes
	*/
	public TShirt(String color, double price, String size, String frontDesign, String backDesign) {
		super(color, price);
		this.size = size;
		this.frontDesign = frontDesign;
		this.backDesign = backDesign;
	}

}