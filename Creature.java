
/**
 * Superclass for the lads n lasses, base fields and methods
 * to be used by the subclasses
 * 
 * @author  Ryan Kennedy
 * @version 11.10.2019
 */
public class Creature
{   
   protected int hp;                       //health points
   protected int strength;                 //max damage
   
   /**
    * Generic no-paramter constructor for creature class
    */
   public Creature(){ 
       hp = 10;
       strength = 10;
   }
   
   /**
    * The big boy constructor for creature class
    * 
    * @param hp The health points the creature starts with
    * @param strength The max damage the creature can deal
    */
   public Creature(int hp, int strength){
       if (hp >= 5)
       this.hp = hp;
       else
       System.out.println("Please enter a Health Point value of 5 or greater");
       
       if (strength >= 5)
       this.strength = strength;
       else
       System.out.println("Please enter a Strength value of 5 or greater");
    }
   /**
    * Returns if the creature is alive or dead
    * 
    * @return True is alive, False is dead
    */ 
   public boolean isAlive(){
       if (hp > 0)
       return true;
       else
       return false;
    }
   
   /**
    * How much damage the creature deals, 1 min and strength is max
    * 
    * @return Damage dealt
    */
   public int damage(){
       return Gen.num(strength)+1;
   }
    
   /**
    * Take damage method
    */
}
