package Java_roadmap.Type_Casting;
import java.util.Scanner;

public class charToInt {
    public static void main(String [] args){
        Scanner inputScanner = new Scanner(System.in);
        char retChar = enterChar(inputScanner);
        int retConv = charConvToInt(retChar);
        printAsciiCode(retChar, retConv);
        inputScanner.close();
    }
    // Methods are defined.
    public static char enterChar(Scanner inputScanner){
        System.out.printf("Please enter any char from your keyboard\n");
        char charValue = inputScanner.next().charAt(0);
        inputScanner.nextLine();
        return charValue;
    }
    public static int charConvToInt(char charValue){
        int charConverted = (int) charValue;

        return charConverted;
    }
    public static void printAsciiCode(char charValue, int charConverted){
        System.out.printf("Your char value was: (%c)\n", charValue);
        System.out.printf("Your int value (ASCII) is: (%d)\n", charConverted);

        return;
    }
}