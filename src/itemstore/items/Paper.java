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
public class Paper extends Item 
{
    public Paper(String _name, int _price)
    {
        name = _name;
        setPrice(_price);
        
        sounds.add("Woosh, I am a paper!");
        sounds.add("Paper: You look shredding!");
        sounds.add("Rock I beat, but scissors I.. don't beat.");
    }
}
