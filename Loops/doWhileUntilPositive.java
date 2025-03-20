package Java_roadmap.Loops;
import java.util.Scanner;
public class doWhileUntilPositive {
    public static void main (String[]args){
        Scanner inputScanner = new Scanner(System.in);
        int retInputNumber = inputNumber(inputScanner);
        printNumber(retInputNumber);
        inputScanner.close();
    }
    // Methods are defined.
    public static int inputNumber(Scanner inputScanner){
        int number = 0;
        do {
        System.out.printf("Please enter a positive number.\n");
        number = inputScanner.nextInt();
        if (number <= 0){
            System.out.printf("ERROR!: Your number CANNOT be negative or EQUAL to zero.\n");
        }
        } while (number <= 0);
        return number;
    }
    public static void printNumber(int number){
        System.out.printf("The positive number is (%d).\n", number);
        return;
    }
}