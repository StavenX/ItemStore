package itemstore.items;

/**
 * Class for the item Cake
 * @author Staven
 */
public class Cake extends Item 
{
    public Cake(String _name, int _price)
    {
        super();
        
        name = _name;
        setPrice(_price); 
        
        addSoundToList("Sploosh, I am the cake!");
        addSoundToList("Instructions: Bake at 23 degrees, for 180 minutes!");
        addSoundToList("If people only ate me, the world would be so much happier!");
    }
    
    @Override
    public void makeSound() 
    {
        System.out.println(getRandomSound());
    }
}
