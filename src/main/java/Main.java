/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Random;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
//command for player to pick and pc to choose random number
    int randomNumber = rand.nextInt(25) + 1;
    System.out.println(" enter guess (1-25):");
    int tryCount = 0;
//while loop to keep the game running
    while (true) {
        int userGuess = scanner.nextInt();
        System.out.println("Please pick a number (1-25)");
        tryCount++;

        if (userGuess > randomNumber) {
            System.out.println("too large");
        }
        else if (userGuess < randomNumber) {
            System.out.println("too small");
        }
        else {
            System.out.println("correct guess");
            System.out.println("Attempts made" + tryCount);
            //a break to stop the loop from running after correct guess
            break;
        }
    }
}


}
