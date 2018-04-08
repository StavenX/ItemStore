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
        name = _name;
        setPrice(_price);
        
        sounds.add("Scrumble mumble, salad ballad!");
        sounds.add("At least they don't eat me in America..");
        sounds.add("Don't grill me. I'll always be raw..");
    }
}
