/**
 * Main item class. Is used to make other specific subclasses
 * (items) with methods.
 * 
 * @author Staven
 */
package itemstore.items;

import java.util.ArrayList;
import java.util.Random;

public abstract class Item implements iItem
{
    ArrayList<String> sounds = new ArrayList<String>();
    private int price;
    public String name;  

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
    
    // Returns a random sound from the items 'sounds' list

    public String getRandomSound()
    {
        Random rand = new Random();
        String returnSound;
        
        int rNumber = rand.nextInt(this.sounds.size());
        returnSound = this.sounds.get(rNumber);
        
        
        return returnSound;
    }
    
    public void makeSound()
    {
        System.out.println(getRandomSound());
        System.out.println(getSoundsSize());
    }
    
    public int getSoundsSize()
    {
        return this.sounds.size();
    }
}
