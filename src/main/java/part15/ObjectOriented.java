package part15;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=10770s
//        starts at about 2:59:30 — stop at about 3:09:48, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 2 — the same lesson, written out step by step
//
// Part 15, video 2 — objects (object-oriented programming)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide).
//    His class with main is called Main. Yours is called ObjectOriented.
//    Leave the "package part15;" line and the "public class ObjectOriented" line alone.
//    He also makes a second class called Car. YOU make that file too:
//    right-click the part15 folder -> New -> Java Class -> type Car -> Enter.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    in THIS file AND in Car.java, saying in YOUR OWN WORDS what that line does.
// defines the name of the class
public class ObjectOriented {
    // the main method alerts java this is the start of the program
    public static void main(String[] args){
        // creates a new car and stores it in myCar1
        Car myCar1 = new Car();
        // creates a new car and stores it in myCar2
        Car myCar2 = new Car();
        // prints out the make of car 1
        System.out.println(myCar1.make);
        // prints out the model of car 1
        System.out.println(myCar1.model);
        // prints an empty new line
        System.out.println();
        // prints out the make of car 2
        System.out.println(myCar2.make);
        // prints out the model of car 2
        System.out.println(myCar2.model);
        // calls the drive method for car 1
        myCar1.drive();
        // calls the brake method for car 1
        myCar1.brake();

    }

}
