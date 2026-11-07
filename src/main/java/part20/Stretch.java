package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// No video in this part — it is a checkpoint.
// Look back at: part 18 (passing objects), part 17 (toString), part 02 (int vs double).
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
// Stretch B2 and B3 also change your Receiver class.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args){
        /* MY GUESS:
        Carter -> Davis, 15 yards: CAUGHT
        Carter -> Davis, 10 yards: CAUGHT
        #11 Davis: 2 catches, 25 yards
         */
        Quarterback carter = new Quarterback("Carter", 40);
        Receiver davis = new Receiver("Davis", 11);
        Receiver slot = davis;
        carter.throwTo(davis, 15);
        carter.throwTo(slot, 10);
        System.out.println(davis);

        //B1
        int completions = 2;
        int attempts = 3;
        // integer division happens first, so 2 / 3 becomes 0, then 0 * 100 equals 0
        System.out.println(completions / attempts * 100);
        // multiplies 2 by 100 first, then divides 200 by 3, giving 66
        System.out.println(completions * 100 / attempts);
        // multiplying by 100.0 makes the calculation use double arithmetic and keeps the decimal places
        System.out.println(completions * 100.0 / attempts);

        //B2
        System.out.println(davis.yardsPerCatch());
        Receiver rookie = new Receiver("Lee", 3);
        System.out.println(rookie.yardsPerCatch());

        //B3
        Receiver brooks = new Receiver("Brooks", 84);
        brooks.catchBall(25);
        System.out.println(brooks);
        brooks.catchBall(5);
        System.out.println(brooks);
    }

}
