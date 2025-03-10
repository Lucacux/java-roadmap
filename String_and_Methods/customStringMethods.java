package Java_roadmap.String_and_Methods;
import java.util.Scanner;
public class customStringMethods {
    public static void main (String[] args){
        Scanner inputScanner = new Scanner(System.in);
        String retUserString = enterString(inputScanner);
        String retStringReversed = stringReverse(retUserString);
        printReversedString(retStringReversed);
        inputScanner.close();
    }
    // Methods are defined.
    public static String enterString (Scanner inputScanner){
        System.out.printf("Please enter one or various words\n");
        System.out.printf("After your input, the word will be reversed\n");
        String userString = inputScanner.nextLine();

        return userString;
    }
    public static String stringReverse(String userString){
        String newString = "";
        for (int i = userString.length() - 1; i >= 0; i--){
            newString = newString + userString.charAt(i);
        }

        return newString;
    }
    public static void printReversedString(String newString){
        System.out.printf("Word or words reversed: (%s)\n", newString);

        return;
    }
}