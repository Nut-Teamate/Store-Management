public class Shorts extends ClothingItem {
	/*
	Initialize Shorts attributes of waistSize, front design, and back design
	*/
	private double waistSize;
	private double length;
	private boolean hasPockets;

	/*
	Returns the waistSize attribute value of the Shorts 
	*/
	public double getWaistSize() {
		return waistSize;
	}

	/*
	Returns the length attribute value of the Shorts 
	*/
	public double getLength() {
		return length;
	}

	/*
	Returns the hasPockets attribute value of the Shorts 
	*/
	public boolean getHasPockets() {
		return hasPockets;
	}

	/*
	Returns Shorts's attributes into a nicely formatted string along with its color and price inherited from the superclass
	*/
	public String toString() {
		return "Shorts:\n-----------\n" + super.toString() + "\nWaist Size: " + waistSize + "\nLength: " + length + "\nHas Pockets " + hasPockets;
	}

	/*
	No argument Constructor for Shorts with its color as white, price as 10, waistSize as 38.7, length as 21.0, and no pockets
	*/
	public Shorts() {
		super("White", 10.0);
		waistSize = 38.7;
		length = 21.0;
		hasPockets = false;
	}

	/*
	Parameterzied Constructor for Shorts with its color as white, price as 10 and other attributes to the user's desire
	*/
	public Shorts(double waistSize, double length, boolean hasPockets) {
		super("White", 10.0);
		this.waistSize = waistSize;
		this.length = length;
		this.hasPockets = hasPockets;
	}

	/*
	Fully parameterized Constructor for Shorts that allows control over all attributes
	*/
	public Shorts(String color, double price, double waistSize, double length, boolean hasPockets) {
		super(color, price);
		this.waistSize = waistSize;
		this.length = length;
		this.hasPockets = hasPockets;
	}
}