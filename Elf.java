/**
 * The Elf class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [18/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/8]
 * Changes attack method to sometimes(10%) cause additional magical damage(2x)
 * 
 * @author Nicholas Trilone
 * @version 11/15/21
 */
public class Elf extends Creature
{
    // instance variables
    private static final int MAX_ELF_STR = 18;
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_STR = 5;
    private static final int MIN_ELF_HP = 8;

    /**
     * Constructor for objects of class Elf -
     * The instantiating class asks for a Elf and the elf class is responsible for
     * return a Elf object with values in the appropriate range
     * 
     */
    public Elf()
    {
        // generates creature of type Elf
        super(
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
        );
          
    }
    
    /**
     * Modified version of attack method for elves
     * 10% chance to do magical(2x) damage
     * @return a value between 1 and str to be used to cause damage to another creature, it is doubled 10% of the time
     */
    public int attack(){
        if(Randomizer.nextInt(10)==1){
            //System.out.println("Damage Doubled!");
            return super.attack()*2;
        }
        return super.attack();
    }
}
