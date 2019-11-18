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
    public ArrayList army;
    
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
     * Method for adding GOOD and EVIL creatures into an army
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
    
    /**
     * Method for adding EVIL creatures into an army
     * 
     * @param input The number of creatures your army will spawn
     */
    public void populateEvil(int input)
    {
        for (int i = 0; i < input; i++){
            int race = Gen.num(100);
            if (race < 90)
            army.add(new Cyberdemon());
            else
            army.add(new Balrog());
        }
    }
    
    /**
     * Method for adding Good creatures into an army
     * 
     * @param input The number of creatures your army will spawn
     */
    public void populateGood(int input)
    {
        for (int i = 0; i < input; i++){
            int race = Gen.num(100);
            if (race < 70)
            army.add(new Human());
            else
            army.add(new Elf());
        }
    }
    
    /**
     * Method for calculating creature death and removal if so
     */
    public void trim(int index){
        Creature temp;
        temp = (Creature)(army.get(index));
        
    }
}
