package Java_roadmap.Conditionals;
import java.util.Scanner;
public class checkIfNumberIsPositiveNegativeOrZero {
    public static void main (String [] args){
        Scanner inputScanner = new Scanner(System.in);
        int retInputNumber = inputNumber(inputScanner);
        numberLogic(retInputNumber);
        inputScanner.close();
    }
    // Methods are defined
    public static int inputNumber(Scanner inputScanner){
        System.out.printf("Please enter a number.\n");
        System.out.printf("The program will check if it is positive, negative or zero.\n");
        int number = inputScanner.nextInt();

        return number;
    }
    public static void numberLogic(int number){
        if (number > 0){
            System.out.printf("The number (%d) is positive.\n", number);
        } else if (number < 0){
            System.out.printf("The number (%d) is negative.\n", number);
        } else {
            System.out.printf("The number is equal to zero.\n");
        }
        return;
    }
}