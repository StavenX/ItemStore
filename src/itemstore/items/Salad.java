/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itemstore.items;

/**
 *
 * @author Staven
 */
public class Salad extends Item 
{
    public Salad(String _name, int _price)
    {
        super();
        
        name = _name;
        super.setPrice(_price);
        
        //super.sounds.add("Scrumble mumble, salad ballad!");
        //super.sounds.add("At least they don't eat me in America..");
        //super.sounds.add("Don't grill me. I'll always be raw..");
        
        addSoundToList("Scrumble mumble, salad ballad!");
        addSoundToList("At least they don't eat me in America..");
        addSoundToList("Don't grill me. I'll always be raw..");
    }
    
    @Override
    public void makeSound() 
    {
        System.out.println(getRandomSound());
    }
}
