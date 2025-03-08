package Java_roadmap.Type_Casting; 
import java.util.Scanner;

public class autoCasting {
    public static void main (String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int retNumber = enterNumber(inputScanner);
        double retAutoCast = autoCast(retNumber);
        showNumbers(retNumber, retAutoCast);
        inputScanner.close();
    }
    // Methods are defined.
    public static int enterNumber(Scanner inputScanner){
        System.out.printf("Please enter a number\n");
        int number = inputScanner.nextInt();
        return number;
    }
    public static double autoCast(int number){
        double numberCast;
        numberCast = number;

        return numberCast;
    }
    public static void showNumbers(int number, double numberCast){
        System.out.printf("Number before cast (%d)\n", number);
        System.out.printf("Number after cast (%f)\n", numberCast);
        return;
    }
}