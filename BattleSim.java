
/**
 * The BattleSim class creates a simplistic large battle simulator, which allows two Armies to battle
 *
 * @author Nicholas Trilone
 * @version 11/15/21
 */
public class BattleSim
{
    private Army armyOne;
    private Army armyTwo;

    /**
     * Default constructor for objects of class BattleSim
     * uses presets to build one good army and one evil army to use, rather than any custom built ones
     */
    public BattleSim()
    {
        armyOne = new Army(0);
        armyTwo = new Army(1);
    }

    /**
     * Constructor for objects of class BattleSim, given
     * @param A the first army in the simulator
     * @param B the second army in the simulator
     */
    public BattleSim(Army A, Army B)
    {
        armyOne=A;
        armyTwo=B;
    }
    
    /**
     * Constructor for objects of class BattleSim
     * allows user to choose army presets
     * 0 = good army
     * 1 = evil army
     * 2 = small test army
     * others = empty army
     * @param A the first army preset used in the simulator
     * @param B the second army preset used in the simulator
     */
    public BattleSim(int A, int B)
    {
        armyOne=new Army(A);
        armyTwo=new Army(B);
    }

    /**
     * Runs the battle simulation, using the provided armies, and prints out which army won
     */
    public void runSimulation() {
        int oneIndex=0;
        int twoIndex=0;
        int turn=0;
        while(oneIndex<armyOne.size()-1&&twoIndex<armyTwo.size()-1){
            while(armyOne.unit(oneIndex).isAlive()&&armyTwo.unit(twoIndex).isAlive()){
                System.out.println();
                System.out.println("TURN "+turn+1); 
                System.out.println();
                System.out.println("Army One, Unit "+oneIndex+1);
                armyOne.unit(oneIndex).printStats();
                System.out.println();
                System.out.println("Army Two, Unit "+twoIndex+1);
                armyTwo.unit(twoIndex).printStats();
                
                
                
                armyOne.unit(oneIndex).takeDamage(armyTwo.unit(twoIndex).attack());
                armyTwo.unit(twoIndex).takeDamage(armyOne.unit(oneIndex).attack());
                turn++;
            }
            if(armyOne.unit(oneIndex).isKnockedOut()){
                oneIndex++;
            }
            if(armyTwo.unit(twoIndex).isKnockedOut()){
                twoIndex++;
            }
        }
        System.out.println();
        if(oneIndex==armyOne.size()-1&&twoIndex==armyTwo.size()-1){
                System.out.println("Tie!");
            }
            else if(oneIndex==armyOne.size()-1){
                System.out.println("Army Two Wins!");
            }
            else{
                System.out.println("Army One Wins!");
            }    
    }
    /**
     * resets each of the armies to a preset, allowing for another simulation to take place
     * 0 = good army
     * 1 = evil army
     * 2 = small test army
     * others = empty army
     * @param A the first army preset used in the simulator
     * @param B the second army preset used in the simulator
     */
    public void resetArmies(int A, int B){
        armyOne = new Army(0);
        armyTwo = new Army(1);
    }
    
}
