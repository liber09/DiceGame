import java.util.ArrayList;
public class Player {
    String name;
    int points;
    ArrayList<Dice> dices;
    // creats a player and set the name and creats the dice arraylist.
    public Player(String name){
        this.name = name;
        dices = new ArrayList();
    }
    public String getName(){
        return this.name;
    }
    public int getPoints(){
       return this.points;
    }
    // rolls all dices in arraylist.
    public void rolldices(){
        for(Dice dice:dices){
            dice.roll();
        }
    }
    // gets the total value of dices
    public int getDiceValue(){
        int sumOfDices = 0;
        for(Dice dice:dices){
            sumOfDices = sumOfDices+dice.getCurrentValue();
        }
        return sumOfDices;
    }
    // increases player point with one.
    public void increaseScore(){
        points++;
    }
    // creates a new dice object with numberOfSides sides
    //And then adds the new dice to the dices list
    public void addDice(int numberOfSides){
        Dice newDice = new Dice(sides);
        this.dices.add(newDice);
    }
}
