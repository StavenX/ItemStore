package itemstore;
import static itemstore.PurchaseHandler.getInput;
import static itemstore.PurchaseHandler.handleInput;
import static itemstore.PurchaseHandler.makeUpperCase;
import itemstore.items.Item;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The ItemStore program implements an ItemStore that 
 * a user can buy items from, through text-commands
 * 
 * @author Staven
 * @version 1.3
 * @since 30-05-2018
 */

public class ItemStore 
{	
    static ArrayList<Item> purchasedItems = new ArrayList<Item>();
    
    public static String input;
    public static Store store;
    public static Scanner scanner;
    
    /**
    * The entry-point. Currently implements a Scanner and Store. 
    * It uses a main loop that handles user-activity through
    * 'getInput()' and 'handleInput()'
    * 
    * @param args Optional arguments for running the program
    */
    public static void main(String[] args) 
    {
        scanner = new Scanner(System.in);
        store = new Store();
        
        while (true)
        {
            getInput();
            handleInput();
        }         
    }
    
    /**
     * Prints the item the user is possessing 
     * if they currently have any.
     * If not, prints that the user has no items. 
     */
    public static void printItems()
    {
        if (purchasedItems.isEmpty())
        {
            System.out.println("You have no items yet.");
            return;
        }
        
        for (int i = 0; i < purchasedItems.size(); i++)
        {
            System.out.println(
            		makeUpperCase(purchasedItems.get(i).name)
            );
        }
    }
}
