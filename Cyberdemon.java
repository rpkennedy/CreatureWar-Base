/**
 * Your more retro hellspawn 
 *
 * @author Ryan Kennedy
 * @version 11.10.2019
 */
public class Cyberdemon extends Demon
{
    /**
     * Generic no-param constructor for objects of class Cyberdemon
     */
    public Cyberdemon()
    {
        super((Gen.num(75)+25),(Gen.num(20)+20));
    }
    
    /**
     * Abstract method for type determination
     */
    public String getType(){
        String s = new String();
        s = "Cyberdemon";
        return s;
    }
}
