package Java_roadmap.Conditionals;
import java.util.Scanner;
public class checkIfNumberIsDivisibleBy3And5 {
    public static void main (String[] args){
        Scanner inputScanner = new Scanner(System.in);
        int retInputNumber = inputNumber(inputScanner);
        isDivisibleBy3and5(retInputNumber);
        inputScanner.close();
    }
    // Methods are defined
    public static int inputNumber(Scanner inputScanner){
        System.out.printf("Please enter a number to check if it's divisible by 3 and 5.\n");
        int number = inputScanner.nextInt();

        return number;
    }
    public static void isDivisibleBy3and5(int number){
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.printf("The number (%d) is divisible by both 3 and 5.\n", number);
        } else if ((number % 3 == 0) != (number % 5 == 0)) { // XOR: divisible by only one, but not both cases.
            if (number % 3 == 0) {
                System.out.printf("The number (%d) is only divisible by 3.\n", number);
            } else {
                System.out.printf("The number (%d) is only divisible by 5.\n", number);
            }
        } else {
            System.out.printf("The number (%d) is not divisible by 3 or 5.\n", number);
        }
        return;
    }
}