/**
 * This class represents the Store object that manages all the methods in the store
 * @author Cayden Liao
 * @version 1.0
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Store {
	/**
	* Initialize Store attributes of name, location, and inventoryItems
	*/
	private String name;
	private String location;
	private List<ClothingItem> inventoryItems = new ArrayList<>();

	/**
	* Returns the number of items in the inventory
	* @return The number of items in the inventory
	*/
	public int getInventorySize() {
		return inventoryItems.size();
	}

	/**
	* Prints out the items in the store inventory in a nicely formatted list 
	*/
	public void displayInventory() {
		// Cleans the terminal for nicer GUI
		System.out.print("\033[H\033[2J");  
    	System.out.flush();

    	// Print out each item in inventory seperated with a unique item number and details
		for (int i=0; i<inventoryItems.size(); i++) {
			System.out.println("Item #" + (i + 1));
			System.out.println(inventoryItems.get(i).toString());
			System.out.println();
		}
	}

	/**
	* Loads the store inventory from a provided inventory file
	* File must be in the format each new line as the type of 
	* ClothingItem followed by its attributes seperated by commas
	* @param file The file linked to the inventory
	* @exception FileNotFoundException Throws an error if the inventory file is not found
	*/
	private void loadInventoryFromFile(String file) {
		try {
			File inventory = new File(file);
			Scanner myReader = new Scanner(inventory);
			while (myReader.hasNextLine()) { // Read all lines in inventory
				String data = myReader.nextLine();
				List<String> dataList = Arrays.asList(data.split(","));

				// Seperate different items into its specific type of ClothingItem and add to main store inventory
				if (((String)dataList.get(0)).equals("TShirt")) {
					ClothingItem tshirt = new TShirt((String)dataList.get(1), Double.parseDouble(dataList.get(2)), (String)dataList.get(3), (String)dataList.get(4), (String)dataList.get(5));
					inventoryItems.add(tshirt);
				} else if (((String)dataList.get(0)).equals("Shorts")) {
					ClothingItem shorts = new Shorts((String)dataList.get(1), Double.parseDouble(dataList.get(2)), Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4)), Boolean.valueOf(dataList.get(5)));
					inventoryItems.add(shorts);
				}
			}
			myReader.close();

		// If file does not exist, throw an error
		} catch (FileNotFoundException e) {
			System.out.println("Hmmm... Seems like we lost our inventory!");
			e.printStackTrace();
			System.exit(0);
		}
	}

	/**
	* Purchases an item from the store
	* Removes item from inventory and puts in Client's cart
	* Subtracts Client's total balance with the price of bought item
	* Contributes to overall expansion of the Store with the ability to
	* handle multiple Clients purchases
	* @param c The Client
	* @param index The item number for the item of purchase
	*/
	public void purchase(Client c, String index) {
		double clientBalance = c.getBalance();
		ClothingItem item = inventoryItems.get(Integer.valueOf(index) - 1);
		inventoryItems.remove(Integer.valueOf(index) - 1);

		c.setBalance(c.getBalance() - item.getPrice());
		c.addToCart(item);
		System.out.println("You just bought:\n" + item.toString() + "\n");
	}

	/**
	* Returns the name of the store
	* @return The name of the store
	*/
	//public String getName() {
	//	return name;
	//}

	/**
	* Returns location of store
	* @return The location of the store
	*/
	//public String getLocation() {
	//	return location;
	//}

	/**
	* Prints welcome message to store with store name and location
	* @return A String object containing the welcome message
	*/
	public String welcome() {
		return "Welcome to our store " + name + " located " + location + "! We hope you have a fun time shopping!";
	}

	/**
	* Prints display message with menu options for store
	* 1. View items in inventory
	* 2. Purchse an item
	* 3. Views the Client's current balance
	* 4. Exits the shop
	* @return A String object displaying the options of the store
	*/
	public String displayMenu() {
		return "Store options:\n1. View Items\n2. Buy Item\n3. View Current Balance\n4. Exit\nChoose option:";
	}

	/**
	* Parameterzied Constructor the store with a changeable name, location, and inventory
	* @param name The name of the Store
	* @param location The location of the Store
	* @param fileName The inventory file name
	*/
	public Store(String name, String location, String fileName) {
		this.name = name;
		this.location = location;
		loadInventoryFromFile(fileName);
	}
}