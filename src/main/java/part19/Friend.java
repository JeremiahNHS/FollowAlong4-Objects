package part19;
// defines the name of the class
public class Friend {
    // declares the attribute name of type String that can be used throughout the class
    String name;
    // declares a static attribute called numberOfFriends of type int that is shared by all Friend objects
    static int numberOfFriends;
    // constructor for the Friend class which takes one parameter; String name
    Friend(String name){
        // assigns the name passed into the constructor to this Friend's name attribute
        this.name = name;
        // increments the numberOfFriends by one each time a new Friend object is created
        numberOfFriends++;
    }
    // a static method called displayFriends which returns nothing
    static void displayFriends(){
        // prints out a message showing the total number of friends
        System.out.println("You have " + numberOfFriends + " friends");
    }
}
