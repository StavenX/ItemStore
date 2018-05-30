package itemstore;
import static itemstore.ItemStore.input;
import static itemstore.ItemStore.printItems;
import static itemstore.ItemStore.scanner;
import static itemstore.ItemStore.store;
import java.util.ArrayList;

/**
 * Input handler for user commands, (everything being input into the program console).
 * Currently written specifically for this ItemStore program.
 * 
 * TODO: Implement a money-system when purchasing something
 * 
 * @author Staven
 * @version 1.3
 * @since 30-05-2018
 */

public class PurchaseHandler 
{
    /**
     * @param s The string to make upper-case
     * @return The string from parameter to upper-case
     */
    public static String makeUpperCase(String s)
    {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
    
    /**
     * Gets input from the user. Will print a prompt
     * at the start of a line
     */
    public static void getInput()
    {
        System.out.print("> ");
        input = scanner.nextLine();
    }
    
    /**
     *  Function that handles all user-input. Every case (except default) is a
     *  command the user can use to interact with the ItemStore
     */
    public static void handleInput()
    {
        String[] arguments = input.toLowerCase().split(" ");
        
        switch(arguments[0]) {
            case "exit" :
                System.exit(0);
                break;
            case "liststoreitems" :
                store.printItems();
                break;
            case "listmyitems" :
                printItems();
                break;
            case "help" :
                printAvailableUserCommands();
                break;
            case "buy" :
                boolean boughtItem = false;
                
                // Iterates through the list of items in the store
                for (int i = 0; i < store.items.size(); i++)
                {
                    /* Checks if the array is actually bigger than 1 item.                   
                     * If not, the user has just entered 'buy' without
                     * parameter, and the program will not buy anything.
                    */ 
                    if (arguments.length > 1)
                    {
                        // If the input corresponds to an item from the Store
                        if (arguments[1].equals(store.items.get(i).name))
                        {
                            // Adds the item to 'purchasedItems' (success)
                            ItemStore.purchasedItems.add(store.items.get(i));
                            System.out.println("- You bought 1 " 
                                + makeUpperCase(store.items.get(i).name)
                                + "."
                            );

                        // Items makes it's unique 'sound' when bought
                        store.items.get(i).makeSound();
                        boughtItem = true;
                        }
                    }
                }
                // If user entered an unrecognisable item with the 'buy' command
                if (boughtItem == false)
                {
                    System.out.println("Invalid item. Enter a valid item.");
                    store.printItems();
                }
                break;
            
            // If no proper command is entered    
            default :
                printInvalidCommand();
                break;
        }
    }
    
    /**
     * Method for informing the user that they typed an invalid command, and
     * provides a help-command
     */
    public static void printInvalidCommand()
    {
        System.out.println("Invalid command. Type 'help' for available commands.");
    }
    
    /**
     * Method that prints all available user-commands. Currently the commands are
     * hard-coded into the function
     */
    public static void printAvailableUserCommands()
    {
        ArrayList<String> commands = new ArrayList<String>();
        commands.add("exit");
        commands.add("listmyitems");
        commands.add("liststoreitems");
        commands.add("buy (item)");
        commands.add("help");
        
        // Iterates  through the list 'commands'
        // and prints entriesas a valid command
        System.out.println("Available commands: ");
        for (int i = 0; i < commands.size(); i++)
        {
            System.out.println("- " + commands.get(i));
        }
    }
}
