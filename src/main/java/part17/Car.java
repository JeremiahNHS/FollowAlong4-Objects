package part17;
// defines the name of the class
public class Car {
    // initializes the attribute make of type String with the value of "Ford", which can be used throughout the class
    String make = "Ford";
    // initializes the attribute model of type String with the value of "Mustang", which can be used throughout the class
    String model = "Mustang";
    // initializes the attribute color of type String with the value of "red", which can be used throughout the class
    String color = "red";
    // initializes the attribute year of type int with the value of 2021, which can be used throughout the class
    int year = 2021;
    // overrides the toString method to return a String describing this car
    public String toString(){
        // returns all the car's attributes as a String with each one on a new line
        return make + "\n" + model + "\n" + color + "\n" + year;
    }
}
