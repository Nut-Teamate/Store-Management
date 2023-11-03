public class Shorts extends ClothingItem {
	/**
	* Initialize Shorts attributes of waistSize, front design, and back design
	*/
	private double waistSize;
	private double length;
	private boolean hasPockets;

	/**
	* Returns the waistSize attribute value of the Shorts 
	* @return The value of the waistSize variable as a double
	*/
	public double getWaistSize() {
		return waistSize;
	}

	/**
	* Returns the length attribute value of the Shorts 
	* @return The value of the length variable as a double
	*/
	public double getLength() {
		return length;
	}

	/**
	* Returns the hasPockets attribute value of the Shorts 
	* @return The value of the hasPockets variable as a boolean
	*/
	public boolean getHasPockets() {
		return hasPockets;
	}

	/**
	* Returns Shorts's attributes into a nicely formatted string along with 
	* its color and price inherited from the superclass
	* @return The attributes of the Shorts objects in a String
	*/
	public String toString() {
		return "Shorts:\n-----------\n" + super.toString() + "\nWaist Size: " + waistSize + "\nLength: " + length + "\nHas Pockets " + hasPockets;
	}

	/**
	* No argument Constructor for Shorts with its color as white, 
	* price as 10, waistSize as 38.7, length as 21.0, and no pockets
	*/
	public Shorts() {
		super("White", 10.0);
		waistSize = 38.7;
		length = 21.0;
		hasPockets = false;
	}

	/**
	* Parameterzied Constructor for Shorts with its color as white, 
	* price as 10 and other attributes to the user's desire
	* @param waistSize The waistSize of the Shorts
	* @param length The length of the Shorts
	* @param hasPockets If the Shorts has pockets
	*/
	public Shorts(double waistSize, double length, boolean hasPockets) {
		super("White", 10.0);
		this.waistSize = waistSize;
		this.length = length;
		this.hasPockets = hasPockets;
	}

	/**
	* Fully parameterized Constructor for Shorts that allows control over all attributes
	* @param color The color of the Shorts
	* @param price The price of the Shorts
	* @param waistSize The waistSize of the Shorts
	* @param length The length of the Shorts
	* @param hasPockets If the Shorts has pockets
	*/
	public Shorts(String color, double price, double waistSize, double length, boolean hasPockets) {
		super(color, price);
		this.waistSize = waistSize;
		this.length = length;
		this.hasPockets = hasPockets;
	}
}