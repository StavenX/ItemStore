package itemstore;

import static itemstore.Start.input;
import static itemstore.Start.printItems;
import static itemstore.Start.scanner;
import static itemstore.Start.store;
import java.util.ArrayList;

/**
 * Input handler for user commands, and basically
 * everything being input into the program console.
 * 
 * Currently written specifically for this ItemStore program.
 * 
 * @author Staven
 */

public class PurchaseHandler 
{
    // Makes input uppercase, f.eks 'string' -> 'String'
    public static String makeUpperCase(String s)
    {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
    
    // Reads the next input from the user
    public static void getInput()
    {
        System.out.print("> ");
        input = scanner.nextLine();
    }
    
    // Main input-handler for all user-input. Every case (except default) is a
    // command the user can use to interact with the system. 
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
                    // Checks if the array is actually bigger than 1 item.
                    // If not, the user has just enteret 'buy' without
                    // parameter, and the program will not buy anything.
                    if (arguments.length > 1)
                    {
                        // If input is the same as an item from store
                        if (arguments[1].equals(store.items.get(i).name))
                        {
                            // Adds the item to 'purchasedItems'
                            Start.purchasedItems.add(store.items.get(i));
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
                // If user did not buy an item through the 'buy' command
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
    // If user entered a command that does not exist
    public static void printInvalidCommand()
    {
        System.out.println("Invalid command. Type 'help' for available commands.");
    }
    
    // Prints all available user-commands
    public static void printAvailableUserCommands()
    {
        ArrayList<String> commands = new ArrayList<String>();
        commands.add("exit");
        commands.add("listmyitems");
        commands.add("liststoreitems");
        commands.add("buy (item)");
        commands.add("help");
        
        // Prints available user-commands buy iterating through 
        // the list of commands in 'commands'
        System.out.println("Available commands: ");
        for (int i = 0; i < commands.size(); i++)
        {
            System.out.println("- " + commands.get(i));
        }
    }
}
