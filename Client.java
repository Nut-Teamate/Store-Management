/**
 * This class represents a Client object as a shopper in the store
 * @author Cayden Liao
 * @version 1.0
 */

import java.util.*;

public class Client {
	/**
	* Initialize Client attributes of balance and cart
	*/
	private double balance;
	private List<ClothingItem> cart = new ArrayList<>();
	
	/**
	* Parameterized Constructor for Client with an adjustable balance 
	* but still an empty shopping cart
	* @param balance The inital balance of the client
	*/
	public Client(double balance) {
		this.balance = balance;
		cart = new ArrayList<>();
	}

	/**
	* Returns the balance attribute value of the Shorts
	* @return The value of the variable balance
	*/
	public double getBalance() {
		return balance;
	}

	/**
	* Allows the shop to set the current balance of the user for 
	* subtracting the price of the purchased item from the total client balance 
	* @param balance The chosen balance for the Client
	* @return None
	*/
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	* Adds the purchased item to the cart
	* @param item The ClothingItem to be added to the cart
	* @return None
	*/
	public void addToCart(ClothingItem item) {
		cart.add(item);
	}

	/**
	* Prints out user's current balance and bought items in the cart
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