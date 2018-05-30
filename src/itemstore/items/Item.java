package itemstore.items;
import java.util.ArrayList;
import java.util.Random;

/**
 * The main item class. This is an abstract class, to ensure that
 * no instance of the type 'Item' will be created.
 * It is used to make other specific subclasses (items)
 * with their own properties.
 * 
 * @author Staven
 * @version 1.3
 * @since 30-05-2018
 */

public abstract class Item implements iItem
{
    ArrayList<String> sounds = new ArrayList<String>();
    protected int price;
    public String name;  

    /**
     * @return The price of the item
     */
    public int getPrice() {
        return price;
    }

    /**
     *  @param price The price to adjust the item's value to
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return The name of the item
     */
    public String getName() {
        return name;
    }
    
    /**
     * @param sound The sound to be added to the 'sounds' list
     */    
    public void addSoundToList(String sound)
    {
        this.sounds.add(sound);
    }
    
    /**
     * @return A random sound from the items 'sounds' list
     */
    public String getRandomSound()
    {
        Random rand = new Random();
        String returnSound;
        
        int rNumber = rand.nextInt(this.sounds.size());
        returnSound = this.sounds.get(rNumber);

        return returnSound;
    }
    
    /**
     * @return The size of the 'sounds' list
     */
    public int getSoundsSize()
    {
        return this.sounds.size();
    }
    
    /**
     * Makes a sound from the item's list 'sounds'
     */
    public void makeSound()
    {
        System.out.println(getRandomSound());
    }
    
    
}
