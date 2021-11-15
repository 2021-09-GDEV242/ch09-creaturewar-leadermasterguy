/**
 * The Balrog class implements a wrapper for the base Demon class with the following additions
 * Implements a maximum/minimum strength for the creature type [100/50]
 * Implements a maximum/minimum hitpoint total for the creature type [200/80]
 * Changes attack method to attack twice
 * 
 * @author Nicholas Trilone
 * @version 11/15/21
 */
public class Balrog extends Demon
{
    // instance variables
    private static final int MAX_BALROG_STR = 100;
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_STR = 50;
    private static final int MIN_BALROG_HP = 80;

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
    
    /**
     * Modified version of attack method for balrogs
     * attacks twice
     * @return a value between 1 and str rolled twice and combined
     */
    public int attack(){
        return super.attack()+super.attack();
    }
    
    /**
     * Prints out theoretical attack values 50 times, used for testing
     */
    public void printAttack(){
        int i=0;
        while(i<50){
            System.out.println("Damage Dealt: "+attack());
            i++;
        }
    }
}

