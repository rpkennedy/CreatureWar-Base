import java.util.ArrayList;
/**
 * Battle sim
 *
 * @author Ryan Kennedy
 * @version 11.11.2019
 */
public class Battle
{
    private Army army1;
    private Army army2;
    private int index2;
    private int index1;
    /**
     * Generic no-param constructor for objects of class Battle
     */
    public Battle()
    {
        army1 = new Army("Forces of Chaos");
        army2 = new Army("Forces of Balance");
        index1 = 0;
        index2 = 0;
    }
    
    
    /**
     * Method for selecting army1 and populating it with a type and specified number
     * 
     * @param army The army you are populating
     * @param type 1 for good creatures, 2 for evil, 3 for mixed
     * @param soldiers The number of creatures in the army
     */
    public void setArmy1(int type, int soldiers){
        if (type == 1)
        army1.populateGood(soldiers);
        else if (type == 2)
        army1.populateEvil(soldiers);
        else if (type == 3)
        army1.populateJoint(soldiers);
        else
        System.out.println("Please enter a valid int 1, 2, or 3, for type"); 
    }
    
    public void setArmies(){
        setArmy1(1,10);
        setArmy2(2,5);
    }
    
    /**
     * Method for selecting army2 and populating it with a type and specified number
     * 
     * @param army The army you are populating
     * @param type 1 for good creatures, 2 for evil, 3 for mixed
     * @param soldiers The number of creatures in the army
     */
    public void setArmy2(int type, int soldiers){
        if (type == 1)
        army2.populateGood(soldiers);
        else if (type == 2)
        army2.populateEvil(soldiers);
        else if (type == 3)
        army2.populateJoint(soldiers);
        else
        System.out.println("Please enter a valid int 1, 2, or 3, for type"); 
    }

    /**
     * 
     */
    public void fight(){
        while (!(army1.army.isEmpty()) && !(army2.army.isEmpty())){
            Creature rep1;
            Creature rep2;

            rep1 = (Creature)(army1.army.get((army1.army.size())-1));
            rep2 = (Creature)(army2.army.get((army2.army.size())-1));
            
            rep1.takeDamage(rep2.calcDamage());
            System.out.println(rep2.calcDamage()+" damage done by "+rep2.getType()+"!");

            if (rep1.isAlive())
                System.out.println(rep1.getType()+" has sustained injuries\n");
            else{
                army1.army.remove((army1.army.size())-1);
                System.out.println(rep1.getType()+" has died\n");
            }
            
                
            rep2.takeDamage(rep1.calcDamage());
            System.out.println(rep1.calcDamage()+" damage done by "+rep1.getType()+"!");

            if (rep2.isAlive())
                System.out.println(rep2.getType()+" has sustained injuries\n");
            else{
                army2.army.remove((army2.army.size())-1);
                System.out.println(rep2.getType()+" has died\n");
            }
        } 
        
        if (army1.army.isEmpty()){
            System.out.println("-------------------------------");
            System.out.println("");
            System.out.println("The Forces of Chaos have won");
            System.out.println("with "+army2.army.size()+" creatures left");
            System.out.println("");
            System.out.println("-------------------------------");
        }
        if (army2.army.isEmpty()){
            System.out.println("-------------------------------");
            System.out.println("");
            System.out.println("The Forces of Balance have won");
            System.out.println("with "+army1.army.size()+" creatures left");
            System.out.println("");
            System.out.println("-------------------------------");
        }
    }
}