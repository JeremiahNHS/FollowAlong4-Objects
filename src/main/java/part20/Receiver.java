package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// Part 20 — CHECKPOINT. No video, no guide.
//
// You write this whole class yourself, starting from an empty file.
// The README lists everything a Receiver needs, one step at a time.
// Main.java uses it, so you can run Main to check your work.
//
// Leave the "package part20;" line alone.
// Under these comments, type the class: public class Receiver { ... }
//
// When it works, put a // comment ABOVE every line of code, in YOUR OWN WORDS (Section B).
// defines the name of the class
public class Receiver {
    // declares the private name attribute of type String that can only be accessed directly within this class
    private String name;
    // declares the private number attribute of type int that can only be accessed directly within this class
    private int number;
    // declares the private catches attribute of type int that can only be accessed directly within this class
    private int catches;
    // declares the private yards attribute of type int that can only be accessed directly within this class
    private int yards;
    // a public constructor for the Receiver class that takes 2 parameters: name and number
    public Receiver(String name, int number){
        // assigns the name passed into the constructor to this Receivers name attribute
        this.name = name;
        // assigns the number passed into the constructor to this Receivers number attribute
        this.number = number;
    }
    // defines a public method called getName that returns the receiver's name as a String
    public String getName(){
        // returns the name of the object when this method is called
        return name;
    }
    // a public method called getNumber that returns an int; the objects number
    public int getNumber(){
        // returns the receiver's number
        return number;
    }
    // a public method called getCatches that returns an int; the objects catches
    public int getCatches() {
        // returns the receiver's total number of catches
        return catches;
    }
    // a public method called getYards that returns an int; the objects yards
    public int getYards() {
        // returns the receiver's total receiving yards
        return yards;
    }
    // defines a public method called catchBall that takes the yards gained and returns nothing
    public void catchBall(int gain){
        // increments catches by 1 everytime this method is called
        catches++;
        // adds the yards gained from the catch to the receiver's total yards
        yards += gain;
    }
    // overrides the toString method to return a String describing this receiver
    public String toString(){
        if (catches == 1 ) {
            // returns the receiver's number, name, catches, and yards as a String
            return "#" + number + " " + name + ": "
                    + catches + " catch, "
                    + yards + " yards";
        } else {
            return "#" + number + " " + name + ": "
                    + catches + " catches, "
                    + yards + " yards";
        }
    }

    public double yardsPerCatch(){
        if (catches == 0){
            return 0.0;
        } else {
            return (double) yards / catches;
        }
    }

}