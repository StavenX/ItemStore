package itemstore.items;

/**
 * Class for the item Salad
 * @author Staven
 */
public class Salad extends Item 
{
    public Salad(String _name, int _price)
    {
        super();
        
        name = _name;
        super.setPrice(_price);
        
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
