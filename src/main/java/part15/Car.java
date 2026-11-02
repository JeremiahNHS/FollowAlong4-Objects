package part15;
// defines the name of the class, a blueprint for a car
public class Car {
    // since there are no constructors every car from this blueprint will be a Chevrolet make
    String make = "Chevrolet";
    // since there are no constructors every car from this blueprint will be a Corvette model
    String model = "Corvette";
    // since there are no constructors every car from this blueprint will be a 2020 model
    int year = 2020;
    // since there are no constructors every car from this blueprint will be blue
    String color = "blue";
    // since there are no constructors every car from this blueprint will be $50000.00
    double price = 50000.00;
    // method named drive which returns nothing
    void drive(){
        // prints out the text
        System.out.println("You drive the car");
    }
    // method named brake which returns nothing
    void brake(){
        // prints out the text
        System.out.println("You step on the brakes");
    }
}