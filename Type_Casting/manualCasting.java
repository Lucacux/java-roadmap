package Java_roadmap.Type_Casting;
import java.util.Scanner;

public class manualCasting {
    public static void main (String[] args){
        Scanner inputScanner = new Scanner(System.in);
        double retNumber = enterNumber(inputScanner);
        int retCastedNumber = castedNumber(retNumber);
        printNumbers(retNumber, retCastedNumber);
        inputScanner.close();
    }
    // Methods are defined.
    public static double enterNumber(Scanner inputScanner){
        System.out.printf("Please enter a number\n");
        double number = inputScanner.nextDouble();

        return number;
    }
    public static int castedNumber(double number){
        int castedNumber = (int) number;
        return castedNumber;
    }
    public static void printNumbers(double number, int castedNumber){
        System.out.printf("Double value: (%f)\n", number);
        System.out.printf("Integer value after casting: (%d)\n", castedNumber);
        return;
    }
}