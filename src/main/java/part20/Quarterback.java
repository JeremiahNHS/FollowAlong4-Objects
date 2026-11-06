package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// Part 20 — CHECKPOINT. No video, no guide.
//
// You write this whole class yourself, starting from an empty file.
// The README lists everything a Quarterback needs, one step at a time.
// Main.java uses it, so you can run Main to check your work.
//
// Leave the "package part20;" line alone.
// Under these comments, type the class: public class Quarterback { ... }
//
// When it works, put a // comment ABOVE every line of code, in YOUR OWN WORDS (Section B).
public class Quarterback {
    // declares the private name attribute of type String that can only be accessed directly within this class
    private String name;
    // declares the private armStrength attribute of type int that can only be accessed directly within this class
    private int armStrength;
    // declares the private attempts attribute of type int that can only be accessed directly within this class
    private int attempts;
    // declares the private completions attribute of type int that can only be accessed directly within this class
    private int completions;
    // declares the private passingYards attribute of type int that can only be accessed directly within this class
    private int passingYards;
    // public constructor for the Quarterback class that takes 2 parameters: name and armStrength
    public Quarterback(String name, int armStrength) {
        // assigns the name passed into the constructor to this Quarterback's name attribute
        this.name = name;
        // assigns the armStrength passed into the constructor to this Quarterback's armStrength attribute
        this.armStrength = armStrength;
    }
    // a public method called getName that returns a String; the objects name
    public String getName() {
        // returns the name of the object when this method is called
        return name;
    }
    // a public method called getCompletions that returns an int; the number of completions
    public int getCompletions() {
        // returns the number of completions
        return completions;
    }
    // a public method called getAttempts that returns an int; the number of attempts
    public int getAttempts() {
        // returns the number of attempts
        return attempts;
    }
    // a public method called getPassingYards that returns an int; the amount of passing yards
    public int getPassingYards() {
        // returns the amount of passing yards
        return passingYards;
    }
    // defines a public method called throwTo that takes a Receiver and the distance of the throw and returns a boolean
    public boolean throwTo(Receiver target, int yards){
        // increments attempts by 1 everytime this method is called
        attempts++;
        // checks if the distance of the throw is greater than the QB's arm strength
        if (yards > armStrength){
            // prints a message showing that the pass was incomplete
            System.out.println(name + " -> " + target.getName() + ", " + yards + " yards: INCOMPLETE");
            // the pass was too far for the QB's arm, so throwTo reports it was not caught
            return false;
        // if he can throw that far the code in {} is ran
        } else {
            // completions is incremented by 1 everytime he completes a pass
            completions++;
            // yards is added to passing yards
            passingYards += yards;
            // calls the Receiver's catchBall method to update the receiver's catches and receiving yards
            target.catchBall(yards);
            // prints out the names of the QB and the target Receiver, the yards for the pass and the message CAUGHT
            System.out.println(name + " -> " + target.getName() + ", " + yards + " yards: CAUGHT");
            // The QB was able to throw that far so throwTo reports it was caught
            return true;
        }
    }
    // an overloaded throwTo method that takes one Receiver parameter and returns a boolean
    public boolean throwTo(Receiver target){
        // calls the first throwTo method so not to rewrite the code and sets 10 as the default yards
        return throwTo(target, 10);
    }
    // defines a public method called completionPercentage that calculates and returns an int
    public int completionPercentage(){
        // checks if the quarterback has made zero passing attempts
        if (attempts == 0){
            // returns 0 because the QB has not made any throws
            return 0;
        // runs this block if the quarterback has made at least one passing attempt
        } else {
            // calculates and returns the percent of completions
            return ((100 * completions) / attempts);
        }
    }
    // overrides the toString method to return a String describing this quarterback
    public String toString(){
        // returns the quarterback's name and passing statistics as a String
        return name + ": " + completions + "/"
                + attempts + ", " + passingYards
                + " yards, " + completionPercentage() + "%";
    }
}