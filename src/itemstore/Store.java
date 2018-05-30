package itemstore;
import static itemstore.PurchaseHandler.makeUpperCase;
import itemstore.items.Cake;
import itemstore.items.Item;
import itemstore.items.Paper;
import itemstore.items.*;
import java.util.ArrayList;

/**
 * A "Store" that holds the item the user potentially can
 * buy. Uses an ArrayList to store the mentioned items
 * 
 * @author Staven
 * @version 1.3
 * @since 30-05-2018
 */

public class Store 
{
    ArrayList<Item> items = new ArrayList<Item>();
    
    public Store()
    {
        // Initialise the different items
        Item paper = new Paper("paper", 10);
        Item cake = new Cake("cake", 20);
        Item salad = new Salad("salad", 15);
        
        // Adding items to ArrayList
        items.add(paper);
        items.add(cake);
        items.add(salad);
        
        printWelcomeMessage(); 
    }
    
    /**
     * Method that prints all the items currently 
     * available in the Store
     */
    public void printItems()
    {
        for (int i = 0; i < items.size(); i++)
        {
            System.out.println(
                    " "
                    + makeUpperCase(items.get(i).name)
                    + " - Price: "
                    + (items.get(i).getPrice())
            );
        }
    }
    
    /**
     * Method that greets the user when they open
     * the program
     */
    public static void printWelcomeMessage()
    {
        System.out.println("--------------------------------");
        System.out.println("|  Welcome to the Happy Shop!  |");
        System.out.println("--------------------------------");
        System.out.println("    Type 'help' for commands    ");
    }
}
