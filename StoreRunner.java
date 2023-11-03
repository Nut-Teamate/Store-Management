import java.util.*;

public class StoreRunner {
	public static void main(String[] args) {

		/*
		Flush out terminal before starting the store
		*/
		System.out.print("\033[H\033[2J");  
    	System.out.flush();
    	
    	/*
    	Create Scanner for user inputs
    	*/
		Scanner input = new Scanner(System.in);

		/*
		Initialize the store and the client
		*/
		Store clothingStore = new Store("Cayden's Clothing Store", "Online", "inventory.txt");
		Client erik = new Client(100.0);

		/*
		Print welcome message
		*/
		System.out.println(clothingStore.welcome());

		/*
		Main store loop that allows for user interaction for the 4 different menu options
		*/
		while (true) {

			// Check if all inventory has been sold
			// Exit out of store if all inventory is gone
			int size = clothingStore.getInventorySize();
			if (size == 0) {
				System.out.println("You bought everything! Goodbye, we hope you enjoyed shopping.");
				input.close();
				break;
			}

			// Main Menu options
			System.out.println(clothingStore.displayMenu());
			String menuOption = input.nextLine();

			// 4 case switch based on options
			if (menuOption.equals("1")) { // Displays current items in stock in the store
				clothingStore.displayInventory();
			} else if (menuOption.equals("2")) { // Purchases items

				// User inputs an item number that they would like to purchase
				System.out.println("What item would you like to buy? (Item #): ");
				String index = input.nextLine();
				
				// Check to make sure it is a valid item
				if (Integer.valueOf(index) > 0 && Integer.valueOf(index) <= size){
					clothingStore.purchase(erik, index);
				} else { // Allow client to retry purchase or exit the store
					System.out.println("Invalid item. Try again? (y/n)");
					String option = input.nextLine();

					if (option.equals("y")) {
						continue;
					} else if (option.equals("n")) {
						System.out.println("Goodbye!");
						break;
					} else {
						System.out.println("Unknown Option. Bye!");
						break;
					}

				}
			} else if (menuOption.equals("3")) { // Prints out client's current balance and items that have been bought
				System.out.println(erik.toString());
				System.out.println();
			} else if (menuOption.equals("4")) { // Exits the store
				System.out.println("Bye!");
				break;
			} else { // Any other option gets rerouted back to the main loop
				System.out.println("Invalid option... Try again!");
			}
		}
	}
}