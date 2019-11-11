
/**
 * Your larger hellspawn
 *
 * @author Ryan Kennedy
 * @version 11.10.2019
 */
public class Balrog extends Demon
{
    /**
     * Generic no-param constructor for objects of class Balrog
     */
    public Balrog()
    {
        super((Gen.num(120)+80),(Gen.num(50)+50));
    }
    
    /**
    * Override Creature.damage--attack twice
    * 
    * @return Damage dealt
    */
   public int damage(){
       return super.damage() + super.damage();
   }
}
