package part16;
// defines the name of the class
public class Human {
    // declares the attribute name of type String as a global variable
    String name;
    // declares the attribute age of type int as a global variable
    int age;
    // declares the attribute weight of type double as a global variable
    double weight;
    //constructor for a Human object which takes 3 arguments; name, age and weight
    Human(String name, int age, double weight){
        // assigns the name passed into the constructor to this human's name attribute
        this.name = name;
        // assigns the age passed into the constructor to this human's age attribute
        this.age = age;
        // assigns the weight passed into the constructor to this human's weight attribute
        this.weight = weight;
    }
    // defines the eat method which returns nothing
    void eat(){
        // prints out this humans name along with the text
        System.out.println(this.name + " is eating");
    }
    // defines the drink method which returns nothing
    void drink(){
        // prints out this humans name along with the text
        System.out.println(this.name + " is drinking *burp*");
    }
}
