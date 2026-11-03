package part18;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13478s
//        starts at about 3:44:40 — stop at about 3:49:20, at "that's the basics of sending objects as arguments"
// Guide: GUIDE.md in this folder, steps 7–10
//
// Part 18, topic 2 — passing objects to a method
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ObjectPassing.
//    Leave the "package part18;" line and the class line alone. Type everything else yourself.
//    You also make two new classes, Garage and Car. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Garage.java and Car.java too.
// defines the name of the class
public class ObjectPassing {
    // the main method is where the program starts running
    public static void main(String[] args){
        // creates a new garage object named garage
        Garage garage = new Garage();
        // creates a new Car object called car1 with the name "BMW"
        Car car1 = new Car("BMW");
        // creates a new Car object called car2 with the name "Tesla"
        Car car2 = new Car("Tesla");
        // passes car1 to the park method of the garage object
        garage.park(car1);
        // passes car2 to the park method of the garage object
        garage.park(car2);
    }
}
