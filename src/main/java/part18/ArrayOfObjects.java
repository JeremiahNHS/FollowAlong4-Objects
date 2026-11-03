package part18;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13121s
//        starts at about 3:38:40 — stop at about 3:44:15, at "that's the basics of arrays of objects"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 18, topic 1 — an array of objects
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayOfObjects.
//    Leave the "package part18;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Food. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Food.java too.
// defines the name of the class
public class ArrayOfObjects {
    // the main method is where the program starts running
    public static void main(String[] args) {
        // creates a new Food object called food1 with the name "pizza"
        Food food1 = new Food("pizza");
        // creates a new Food object called food2 with the name "hamburger"
        Food food2 = new Food("hamburger");
        // creates a new Food object called food3 with the name "hot dog"
        Food food3 = new Food("hot dog");
        // creates an array called refrigerator that holds references to Food objects
        Food[] refrigerator = {food1, food2, food3};
        // prints out index name of the Food object at index 0 in the refrigerator array
        System.out.println(refrigerator[0].name);
        // prints out index name of the Food object at index 1 in the refrigerator array
        System.out.println(refrigerator[1].name);
        // prints out index name of the Food object at index 2 in the refrigerator array
        System.out.println(refrigerator[2].name);
    }

}
