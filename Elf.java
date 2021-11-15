/**
 * The Elf class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [18/5]
 * Implements a maximum/minimum hitpoint total for the creature type [30/10]
 * 
 * @author Nicholas Trilone
 * @version 11/15/21
 */
public class Elf extends Creature
{
    // instance variables
    private static final int MAX_ELF_STR = 18;
    private static final int MAX_ELF_HP = 30;
    private static final int MIN_ELF_STR = 5;
    private static final int MIN_ELF_HP = 10;

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
}
