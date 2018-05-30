package itemstore.items;

/**
 * Class for the item Paper
 * @author Staven
 */
public class Paper extends Item 
{
    public Paper(String _name, int _price)
    {
        super();
        
        name = _name;
        setPrice(_price);
        
        addSoundToList("Woosh, I am a paper!");
        addSoundToList("Paper: You look shredding!");
        addSoundToList("Rock I beat, but scissors I.. don't beat.");     
    }
    
    @Override
    public void makeSound() 
    {
        System.out.println(getRandomSound());
    }
}
