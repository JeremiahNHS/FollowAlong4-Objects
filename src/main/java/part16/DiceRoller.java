package part16;
// allows me to access the Random tool from the java.util package
import java.util.Random;
// defines the name of the class
public class DiceRoller {
    // declares the variable random of type Random as a global variable
    Random random;
    // declares the variable number of type int as a global variable
    int number;
    // constructor for the DiceRoller which takes no arguments
    DiceRoller(){
        // assigns the variable random with a random number generator
        random = new Random();
        // calls the roll method which returns nothing and prints out the number rolled
        roll();
    }
    // defines a method called roll that returns nothing
    void roll(){
        // rolls a random number between 1 and 6 and stores it in number
        number = random.nextInt(6) + 1;
        // prints out the value of number
        System.out.println(number);
    }
}
