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
    protected int price;
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
    
    // Adds a 'sound' to the object's sound list
    public void addSoundToList(String sound)
    {
        this.sounds.add(sound);
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
    
    // Returns the list of the 'sounds' list
    public int getSoundsSize()
    {
        return this.sounds.size();
    }
    
    // Makes a sound from the item's list 'sounds', and
    // 
    public void makeSound()
    {
        System.out.println(getRandomSound());
        System.out.println("Voicelines in list: " + getSoundsSize());
    }
    
    
}
