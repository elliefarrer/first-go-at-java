// import this class to do raw_input equivalents
import java.util.Scanner;
// import this class to do random stuff
import java.util.Random;

public class ControlFlow {
  public static void main(String[] args) {

    // Get a random number between 0 and 9 with Random
    Random rand = new Random();
    int computerNumber = rand.nextInt(9) + 0;

    // Get user to input a number through raw input
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a number between 0 and 9: ");
    int userNumber = reader.nextInt();
    // reader.close();

    // System.out.println("You entered " + userNumber);
    // System.out.println("The computer selected " + computerNumber);

    if (userNumber == computerNumber) {
      System.out.println("The numbers are the same");
    } else if (userNumber > computerNumber) {
      System.out.println("Your number is higher");
    } else {
      System.out.println("The computer's number is higher");
    }

    // Scanner.reader = new Scanner(System.in);
    System.out.println("Do you like this code? (Y/N): ");
    char userFeedback = reader.next().charAt(0);
    reader.close();

    char validOrNot = (userFeedback == 'Y' || userFeedback == 'n' || userFeedback == 'N' || userFeedback == 'y') ? 'Y' : 'N';

    if (validOrNot == 'Y') {
      switch (userFeedback) {

        case 'Y': System.out.println("Cool and good");
          break;

        case 'y': System.out.println("Cool and nice");
          break;

        case 'n': System.out.println("Sad");
          break;

        default: System.out.println("ANGRY!");
      }
    }
  }
}
