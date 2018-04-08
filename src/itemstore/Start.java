package itemstore;
import static itemstore.PurchaseHandler.getInput;
import static itemstore.PurchaseHandler.handleInput;
import static itemstore.PurchaseHandler.makeUpperCase;
import itemstore.items.Item;
import java.util.ArrayList;
import java.util.Scanner;

public class Start 
{
    static ArrayList<Item> purchasedItems = new ArrayList<Item>();
    
    static String input;
    static Store store;
    static Scanner scanner;
    
    public static void main(String[] args) 
    {
        scanner = new Scanner(System.in);
        store = new Store();
        
        /*
        * While the program is running, handles all input
        * through 'getInput' and 'handleInput'.
        */
        while (true)
        {
            getInput();
            handleInput();
        }         
    }
    
    // Prints the users items
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
