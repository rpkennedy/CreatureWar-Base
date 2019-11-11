import java.util.ArrayList;
/**
 * Create an army, has a name an array list of creatures
 *
 * @author Ryan Kennedy
 * @version 11.10.2019
 */
public class Army
{
    private String name;
    private ArrayList army;
    
    /**
     * Constructor for objects of class Army
     * @param name The name of the army
     */
    public Army(String name)
    {
        this.name = name;
        army = new ArrayList();
    }

    
    /**
     * Method for adding good and evil creatures into an army
     * 
     * @param input The number of creatures your army will spawn
     */
    public void populateJoint(int input)
    {
        for (int i = 0; i < input; i++){
            int race = Gen.num(100);
            if (race < 40)
            army.add(new Human());
            else if (race < 80)
            army.add(new Elf());
            else if (race < 95)
            army.add(new Cyberdemon());
            else
            army.add(new Balrog());
        }
    }
}
