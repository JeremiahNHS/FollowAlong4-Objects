package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
//        starts at about 3:10:07 — stop at about 3:19:32, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 1 — the same lesson, written out step by step
//
// Part 16, video 1 — constructors
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide).
//    His class with main is called Main. Yours is called Constructors.
//    Leave the "package part16;" line and the "public class Constructors" line alone.
//    He also has a second class called Human. YOU make that file too:
//    right-click the part16 folder -> New -> Java Class -> type Human -> Enter.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    in THIS file AND in Human.java, saying in YOUR OWN WORDS what that line does.
// defines the name of the class
public class Constructors {
    // the main method alerts java this is the start of the program
    public static void main(String[] args){
        // creates a new Human object called human1 using 3 arguments
        Human human1 = new Human("Rick",65,70);
        // creates a new Human object called human2 using 3 arguments
        Human human2 = new Human("Morty",16,50);
        // prints out human1's name
        System.out.println(human1.name);
        // prints out human2's name
        System.out.println(human2.name);
        // calls the eat method for human1 which returns nothing but prints out "Rick is eating"
        human1.eat();
        // calls the drink method for human2 which returns nothing but prints out "Morty is drinking *burp*"
        human2.drink();

    }
}
