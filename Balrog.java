/**
 * The Balrog class implements a wrapper for the base Demon class with the following additions
 * Implements a maximum/minimum strength for the creature type [18/5]
 * Implements a maximum/minimum hitpoint total for the creature type [30/10]
 * 
 * @author Nicholas Trilone
 * @version 11/15/21
 */
public class Balrog extends Demon
{
    // instance variables
    private static final int MAX_BALROG_STR = 18;
    private static final int MAX_BALROG_HP = 30;
    private static final int MIN_BALROG_STR = 5;
    private static final int MIN_BALROG_HP = 10;

    /**
     * Constructor for objects of class Balrog -
     * The instantiating class asks for a Balrog and the balrog class is responsible for
     * return a Balrog object with values in the appropriate range
     * 
     */
    public Balrog()
    {
        // generates creature of type Balrog
        super(
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP,    
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR
        );
          
    }
}

