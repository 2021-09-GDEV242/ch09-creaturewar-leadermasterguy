import java.util.ArrayList;
import java.util.Arrays;
/**
 * The Army class constructs and contains an ArrayList of creatures
 * meant to represent an army that can be used in BattleSim
 * can be created empty, or with a preset, depending on parameters
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
     * given an integer, will fill the Army with a preset
     * 0 = good army
     * 1 = evil army
     * 2 = small test army
     * others = empty army
     * @param premade determines which premade army will be used
     */
    public Army(int premade)
    {
        creatures = new ArrayList();
        if(premade==0){
            setGoodArmy();
        }
        if(premade==1){
            setEvilArmy();
        }
        if(premade==2){
            setTestArmy();
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
     * Sets the army object to equal a randomly constructed good army
     */
    public void setGoodArmy()
    {
        creatures.clear();
        int i=0;
        int r=0;
        while (i<100){
            r=Randomizer.nextInt(10);
            if(r<7){
                addCreature(1,"human");
            }
            else{
               addCreature(1,"elf"); 
            }
            i++;
        }
    }

    /**
     * Sets the army object to equal a randomly constructed evil army
     */
    public void setEvilArmy()
    {
        creatures.clear();
        int i=0;
        int r=0;
        while (i<50){
            r=Randomizer.nextInt(25);
            if(r==25){
                addCreature(1,"balrog");
            }
            else if(r>18){
                addCreature(1,"cyber");
            }
            else{
                addCreature(1,"human");
            }
            i++;
        }
    }
    
    /**
     * Sets the army object to a group of five randomly generated humans
     * for testing
     */
    public void setTestArmy()
    {
        creatures.clear();
        int i=0;
        while (i<5){
                addCreature(1,"human");
                i++;
            }

    }
    
    /**
     * returns creatures ArrayList
     * @return creatures ArrayList of creatures in the Army
     */
    public ArrayList getCreatures(){
        return creatures;
    }
    
    /**
     * returns a creature in the Army, given its index
     * @return a particular Creature object in the creatures ArrayList
     */
    public Creature unit(int n){
        return creatures.get(n);
    }
    
    /**
     * returns the size of the Army
     * @return size of creatures ArrayList
     */
    public int size(){
        return creatures.size();
    }
    }