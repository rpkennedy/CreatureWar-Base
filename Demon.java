/**
 * Your hellspawn superclass 
 *
 * @author Ryan Kennedy
 * @version 11.10.2019
 */
public abstract class Demon extends Creature
{
    /**
     * Generic no-param constructor for objects of class Demon
     */
    public Demon()
    {
        super();
    }
    
    public Demon(int a, int b){
        super(a, b);
    }
    public abstract String getType();
    /**
    * Override Creature.damage--5% chance to do +50 dam
    * 
    * @return Damage dealt
    */
    public int damage(){
       if (Gen.num(19) == 4){
       System.err.println("Demonic Strength: +50");
       return Gen.num(strength)+51;}
       else
       return Gen.num(strength)+1;
    }
}
