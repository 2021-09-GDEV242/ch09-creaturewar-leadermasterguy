import java.util.ArrayList;
import java.util.Arrays;
/**
 * The Army class constructs and contains an ArrayList of creatures
 * meant to represent an army that can be used in BattleSim
 * can be created empty, or with premade values, depending on parameters
 * 
 * @author Nicholas Trilone
 * @version 11/15/21
 */
public class Army
{
    // instance variables
    private ArrayList<Creature> creatures;

    /**
     * Default constructor for objects of class Army
     * Creates an empty ArrayList of creatures to allow for manual construction
     */
    public Army()
    {
         creatures = new ArrayList();
    }

    /**
     * Constructor for objects of class Army
     * given an integer, will fill the Army with preset creatures
     * 0 = good army
     * 1 = evil army
     * others = empty army
     * @param premade determines which premade army will be used
     */
    public Army(int premade)
    {
        creatures = new ArrayList();
        if(premade==0){

        }
        if(premade==1){

        }
    }

    /**
     * Adds a number of a certain kind of creature to the army
     * @param number number of creatures added
     * @param type kind of creature created
     */
    public void addCreature(int number,String type)
    {
        for(int i=0;i<number;i++)
        {
            if(type=="human"){
                Human human = new Human();
                creatures.add(human);
            }       
            if(type=="elf"){
                Elf elf = new Elf();
                creatures.add(elf);
            }  
            if(type=="cyber"){
                CyberDemon cyber = new CyberDemon();
                creatures.add(cyber);
            }  
            if(type=="balrog"){
                Balrog balrog = new Balrog();
                creatures.add(balrog);
            }  
        }
    }
    
    public void printArmy()
    {
        System.out.println(creatures);
    }

    /**
     * Empties the army of all creatures
     */
    public void clearArmy()
    {
        creatures.clear();
    }

    /**
     * Sets the army object to equal a premade good army
     */
    public void setGoodArmy()
    {

    }

    /**
     * Constructor for objects of class Army
     */
    public void setEvilArmy()
    {

    }
}
