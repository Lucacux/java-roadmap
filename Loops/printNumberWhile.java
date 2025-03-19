package Java_roadmap.Loops;
import java.util.Scanner;
public class printNumberWhile {
    public static void main (String[]args){
        Scanner inputScanner = new Scanner(System.in);
        int retInputNumber = inputNumber(inputScanner);
        whileNLogic(retInputNumber);
        inputScanner.close();
    }
    // Methods are defined. 
    public static int inputNumber(Scanner inputScanner){
        System.out.printf("Please enter a number.\n");
        int number = inputScanner.nextInt();
        return number;
    }
    public static void whileNLogic(int number){
        int trueCondition = 0;
        while (trueCondition <= number){
            System.out.printf("%d\n",trueCondition);
            trueCondition++;
        }
        return;
    }
}