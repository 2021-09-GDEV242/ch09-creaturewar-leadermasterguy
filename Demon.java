/**
 * The Demon class implements a wrapper for the base Creature class with the following additions
 * Changes attack method to sometimes(5%) cause additional magical damage(+50)
 * 
 * @author Nicholas Trilone
 * @version 11/15/21
 */
//I believe it would be correct to make this class abstract, because it shouldn't be instantiated directly??
//please correct me if I'm wrong in this assumption
public abstract class Demon extends Creature
{ 
    /**
     * Constructor for objects of class Demon
     * Adds an aditional effect to the attack method for all subclasses
     */
    public Demon(int health, int strength)
    {
        super(health,strength);
    }

    /**
     * Modified version of attack method for demons
     * 5% chance to do magical(+50) damage
     * @return a value between 1 and str to be used to cause damage to another creature, 50 is added to it 5% of the time
     */
    public int attack(){
        if(Randomizer.nextInt(20)==1){
            //System.out.println("Damage +50!");
            return super.attack()+50;
        }
        return super.attack();
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
