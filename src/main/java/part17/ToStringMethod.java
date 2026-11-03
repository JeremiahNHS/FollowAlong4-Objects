package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12741s
//        starts at about 3:32:20 — stop at about 3:38:30, at "that's how the toString method works"
// Guide: GUIDE.md in this folder, steps 8–12
//
// Part 17, topic 2 — the toString method
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ToStringMethod.
//    Leave the "package part17;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Car. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Car.java too.
// defines the name of the class
public class ToStringMethod {
    // the main method is where the program starts running
    public static void main(String[] args){
        // creates a new Car object named car
        Car car = new Car();
        // prints out the make of car
        System.out.println(car.make);
        // prints out the model of car
        System.out.println(car.model);
        // prints out the color of car
        System.out.println(car.color);
        // prints out the year of car
        System.out.println(car.year);
        // explicitly calls the toString method to print out the car's information
        System.out.println(car.toString());
        // implicit way to print out the overwritten toString method
        System.out.println(car);
    }

}
