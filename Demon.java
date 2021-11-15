/**
 * The Demon class implements a wrapper for the base Creature class with the following additions
 * Changes attack method to sometimes(5%) cause additional magical damage(+50)
 * 
 * @author Nicholas Trilone
 * @version 11/15/21
 */
public class Demon extends Creature
{
    private int str;
    
    /**
     * Constructor for objects of class Demon
     * Adds an aditional effect to the attack method for all subclasses
     */
    public Demon(int strength, int health)
    {
        super(health,strength);
        str=strength;
    }

    /**
     * Modified version of attack method for demons
     * 5% chance to do magical(+50) damage
     * @return a value between 1 and str to be used to cause damage to another creature, 50 is added to it 5% of the time
     */
    public int attack(){
        if(Randomizer.nextInt(20)==1){
            return Randomizer.nextInt(str)+50;
        }
        return Randomizer.nextInt(str);
    }
}
