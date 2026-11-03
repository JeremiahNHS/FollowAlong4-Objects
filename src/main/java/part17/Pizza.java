package part17;
// defines the name of the class
public class Pizza {
    // declares the attribute bread of type String as a global variable, can be used throughout the class
    String bread;
    // declares the attribute sauce of type String as a global variable, can be used throughout the class
    String sauce;
    // declares the attribute cheese of type String as a global variable, can be used throughout the class
    String cheese;
    // declares the attribute topping of type String as a global variable, can be used throughout the class
    String topping;
    // overloaded constructor #1 for Pizza which takes 4 parameters
    public Pizza(String bread, String sauce, String cheese, String topping) {
        // assigns the bread passed into the constructor to this pizza's bread attribute
        this.bread = bread;
        // assigns the sauce passed into the constructor to this pizza's sauce attribute
        this.sauce = sauce;
        // assigns the cheese passed into the constructor to this pizza's cheese attribute
        this.cheese = cheese;
        // assigns the topping passed into the constructor to this pizza's topping attribute
        this.topping = topping;
    }
    // overloaded constructor #2 for Pizza which takes 3 parameters
    public Pizza(String bread, String sauce, String cheese) {
        // assigns the bread passed into the constructor to this pizza's bread attribute
        this.bread = bread;
        // assigns the sauce passed into the constructor to this pizza's sauce attribute
        this.sauce = sauce;
        // assigns the cheese passed into the constructor to this pizza's cheese attribute
        this.cheese = cheese;
    }
    // overloaded constructor #3 for Pizza which takes 2 parameters
    public Pizza(String bread, String sauce) {
        // assigns the bread passed into the constructor to this pizza's bread attribute
        this.bread = bread;
        // assigns the sauce passed into the constructor to this pizza's sauce attribute
        this.sauce = sauce;
    }
    // overloaded constructor #4 for Pizza which takes 1 parameter
    public Pizza(String bread) {
        // assigns the bread passed into the constructor to this pizza's bread attribute
        this.bread = bread;
    }
    // overloaded constructor #5 for Pizza which takes no parameters
    public Pizza(){
        // empty constructor that creates a Pizza object without assigning any attributes
    }
}
