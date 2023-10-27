/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
//learned random comm req. activation command in order to use
    import java.util.Random;
//learned scanner comm req. activation command in order to use
    import java.util.Scanner;
//
public static void main(String[] args){
      //need a loop to run the game
    for (int i = 0; i < 10; i++) { System.out.printIn("");
            // need random generator
        Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1;
        System.out.printIn(" enter guess (1-10)");
// need IF statement
       // "too large", "too small", "correct guess",
    if (userGuess > Random){
            System.out.printIn("too large");}

        else if (userGuess < Random) {
            System.out.printIn ("too small");}

        else(userGuess == Random){
            System.out.printIn ("correct guess");
        }
// code a user pick comm
        Scanner scanner = new Scanner(System.in);
        int userGuess = scanner.nextInt();
    }
}
