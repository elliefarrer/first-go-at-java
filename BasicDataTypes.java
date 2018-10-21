public class BasicDataTypes {
  public static void main(String[] args) {
    // Testing data types based on Scrabble letters and their values
    boolean gameIsRunning = true;

    char firstLetter = 'J';
    char secondAndLastLetter = 'a';
    char thirdLetter = 'v';

    int firstValue = 8;
    int secondValue = 1;
    int thirdValue = 4;

    int result = firstValue + secondValue + thirdValue + secondValue;

    int averageValue = result / 4;

    System.out.println("The total of " + firstLetter + secondAndLastLetter + thirdLetter + secondAndLastLetter + " is " + result);

    System.out.println(firstValue > secondValue);

    System.out.println(firstValue == '8');

    System.out.println("The average score per letter is " + averageValue);
  }
}
