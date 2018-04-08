package itemstore;

import static itemstore.PurchaseHandler.makeUpperCase;
import itemstore.items.Cake;
import itemstore.items.Item;
import itemstore.items.Paper;
import itemstore.items.*;
import java.util.ArrayList;

/**
 * A "store" that holds items that a costumer can buy from.
 * 
 * @author Staven
 */

public class Store 
{
    ArrayList<Item> items = new ArrayList<Item>();
    
    public Store()
    {
        // Initialize the different items
        Item paper = new Paper("paper", 10);
        Item cake = new Cake("cake", 20);
        Item salad = new Salad("salad", 15);
        
        // Adding items to ArrayList
        items.add(paper);
        items.add(cake);
        items.add(salad);
        
        printWelcomeMessage(); 
    }
    
    // Prints all the items in the ArrayList
    public void printItems()
    {
        for (int i = 0; i < items.size(); i++)
        {
            System.out.println(
                    makeUpperCase(items.get(i).name)
                    + " - Price: "
                    + (items.get(i).getPrice())
            );
        }
    }
    
    public static void printWelcomeMessage()
    {
        System.out.println("--------------------------------");
        System.out.println("|  Welcome to the Happy Shop!  |");
	System.out.println("--------------------------------");
        System.out.println("    Type 'help' for commands    ");
    }
}
