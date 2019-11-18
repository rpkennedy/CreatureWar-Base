import java.util.Random;
/**
 * Your average fleshy mortal 
 *
 * @author Ryan Kennedy
 * @version 11.10.2019
 */
public class Human extends Creature
{
    private Random rand = new Random();
    /**
     * Generic no-param constructor for objects of class Human
     */
    public Human()
    {
        super((Gen.num(20)+10),(Gen.num(13)+5));
    }
    
    /**
     * Abstract method for type determination
     */
    public String getType(){
        String s = new String();
        s = "Human";
        return s;
    }
}
