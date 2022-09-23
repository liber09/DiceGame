import java.util.Random;
public class Dice {
    int currentValue;
    int numberOfSides;
    private static Random rnd;

    // creats a dice obeject.
    public Dice(int numberOfSides){
        this.numberOfSides = numberOfSides;
    }
    //returns the number of sides of the dice.
    public int getNumberOfSides(){
       return this.numberOfSides;
    }
    // returns the current value of the dice.
    public int getCurrentValue(){
        return this.currentValue;
    }
    // roll the dice and updates current value.
    public void roll(){
        this.currentValue = rnd.nextInt(this.numberOfSides)+1;
    }
}
