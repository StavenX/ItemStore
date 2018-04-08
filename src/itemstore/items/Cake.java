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
public class Cake extends Item 
{
    public Cake(String _name, int _price)
    {
        name = _name;
        setPrice(_price); 
        
        sounds.add("Sploosh, I am the cake.");
        sounds.add("Instructions: Bake at 23 degrees, for 180 minutes.");
        sounds.add("If people only ate me, the world would be so much happier.");
    }      
}
