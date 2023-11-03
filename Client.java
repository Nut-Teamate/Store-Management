import java.util.*;

public class Client {
	/*
	Initialize Client attributes of balance and cart
	*/
	private double balance;
	private List<ClothingItem> cart = new ArrayList<>();

	/*
	No argument Constructor for Client with a default balance of 1000.0 and an empty shopping cart
	*/
	public Client() {
		balance = 1000.0;
		cart = new ArrayList<>();
	}

	/*
	Parameterized Constructor for Client with an adjustable balance but still an empty shopping cart
	*/
	public Client(double balance) {
		this.balance = balance;
		cart = new ArrayList<>();
	}

	/*
	Returns the balance attribute value of the Shorts 
	*/
	public double getBalance() {
		return balance;
	}

	/*
	Allows the shop to set the current balance of the user for subtracting the price of the purchased item from the total client balance 
	*/
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/*
	Adds the purchased item to the cart
	*/
	public void addToCart(ClothingItem item) {
		cart.add(item);
	}

	/*
	Prints out user's current balance and bought items in the cart
	*/
	public String toString() {
		System.out.print("\033[H\033[2J");  
    	System.out.flush();  
		String clientDetails = "Your balance is: $" + balance + "\nYou have currently bought: \n";
		
		// Check if client has actually purchased anything
		if (cart.size() == 0) {
			clientDetails = clientDetails.concat("Nothing!");
		} else {
			for (int i=0; i<cart.size(); i++) {
				clientDetails = clientDetails.concat((String)cart.get(i).toString() + "\n");
			}
		}
		return clientDetails;
	}
}