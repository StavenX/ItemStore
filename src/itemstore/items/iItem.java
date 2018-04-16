package itemstore.items;

import java.util.ArrayList;

public interface iItem 
{
    ArrayList sounds = new ArrayList();
    
    int getSoundsSize();
    int getPrice();
    
    void setPrice(int price);
    void makeSound();
    void addSoundToList(String sound);
    
    String getName();
    String getRandomSound();
}

