/**
 * Your magical fleshy mortal, watch out 
 *
 * @author Ryan Kennedy
 * @version 11.10.2019
 */
public class Elf extends Creature
{
   /**
    * Generic no-param constructor for objects of class Elf
    */
   public Elf()
   {
        super((Gen.num(17)+8),(Gen.num(13)+5));
   }
    
   /**
    * Override Creature.damage--10% chance to deal 2x dam
    * 
    * @return Damage dealt
    */
   public int damage(){
       if (Gen.num(9) == 4){
       System.err.println("Elven Magic: 2x damage");
       return 2*(Gen.num(strength)+1);}
       else
       return Gen.num(strength)+1;
   }
   
   /**
     * Abstract method for type determination
     */
    public String getType(){
        String s = new String();
        s = "Elf";
        return s;
    }
}
