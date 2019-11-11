import java.util.Random;
/**
 * Write a description of class Gen here.
 *
 * @author Ryan Kennedy
 * @version 11.11.2019
 */
public class Gen
{
    private static Random rand;

    /**
     * Constructor for objects of class Gen
     */
    public Gen()
    {
        // initialise instance variables
        rand = new Random();
    }

    /**
     * Generate random number
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static int num(int y)
    {
        // put your code here
        return rand.nextInt(y);
    }
}
