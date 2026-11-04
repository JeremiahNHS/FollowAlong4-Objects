package part19;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13800s
//        starts at about 3:50:00 — stop at about 3:57:15, at "that's the basics of the static keyword"
// Guide: GUIDE.md in this folder, steps 1–9
//
// Part 19 — the static keyword
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called StaticKeyword.
//    Leave the "package part19;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Friend. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Friend.java too.
// defines the name of the class
public class StaticKeyword {
    // the main method is where the program starts running
    public static void main(String[] args){
        // grabs the numberOfFriends from the Friend class then prints it, doesn't need an object because its static
        System.out.println(Friend.numberOfFriends);
        // a new Friend object called friend1 named SpongeBob
        Friend friend1 = new Friend("SpongeBob");
        // a new Friend object called friend2 named Patrick
        Friend friend2 = new Friend("Patrick");
        // a new Friend object called friend3 named Squidward
        Friend friend3 = new Friend("Squidward");
        // calls the displayFriends method directly from the class because its static
        Friend.displayFriends();
        // a new Friend object called friend4 named Sandy
        Friend friend4 = new Friend("Sandy");
        // calls the displayFriends method directly from the class because its static
        Friend.displayFriends();
        // calls the round method from the Math class without having to create an object, and prints it out
        System.out.println(Math.round(3.14));
    }

}
