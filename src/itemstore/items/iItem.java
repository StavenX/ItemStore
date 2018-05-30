package itemstore.items;
import java.util.ArrayList;

/**
 * Interface that provides methods that the Item-class
 * has to implement.
 * Also mentions a list of "sounds" the item will have
 * 
 * @author Staven
 * @version 1.3
 * @since 30-05-2018
 */

public interface iItem 
{
    ArrayList<String> sounds = new ArrayList<String>();
    
    int getSoundsSize();
    int getPrice();
    
    void setPrice(int price);
    void makeSound();
    void addSoundToList(String sound);
    
    String getName();
    String getRandomSound();
}

