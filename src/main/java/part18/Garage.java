package part18;
// defines the name of the class
public class Garage {
    // creates a method called park which returns nothing
    void park(Car car){
        // prints out the text informing that the car parking
        System.out.println("The " + car.name + " is parked in the garage");
    }

    void leave(Car car){
        System.out.println("The " + car.name + " left the garage");
    }
}
