/**
 * The CyberDemon class implements a wrapper for the Demon class with the following additions
 * Implements a maximum/minimum strength for the creature type [40/20]
 * Implements a maximum/minimum hitpoint total for the creature type [100/25]
 * 
 * @author Nicholas Trilone
 * @version 11/15/21
 */
public class CyberDemon extends Demon
{
    // instance variables
    private static final int MAX_CDEMON_STR = 40;
    private static final int MAX_CDEMON_HP = 100;
    private static final int MIN_CDEMON_STR = 20;
    private static final int MIN_CDEMON_HP = 25;

    /**
     * Constructor for objects of class CyberDemon -
     * The instantiating class asks for a CyberDemon and the cyber demon class is responsible for
     * return a CyberDemon object with values in the appropriate range
     * 
     */
    public CyberDemon()
    {
        // generates creature of type CyberDemon
        super(
            Randomizer.nextInt(MAX_CDEMON_HP-MIN_CDEMON_HP)+MIN_CDEMON_HP,    
            Randomizer.nextInt(MAX_CDEMON_STR-MIN_CDEMON_STR)+MIN_CDEMON_STR
        );
          
    }
}

