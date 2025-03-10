package Java_roadmap.String_and_Methods;
import java.util.Scanner;

public class basicStringsOps {
    public static void main (String[] args){
        Scanner inputScanner = new Scanner(System.in);
        String retUserString = userString(inputScanner);
        String retUpperLogic = upperLogic(retUserString);
        String retLowerLogic = lowerLogic(retUserString);
        printAllStrings(retUserString, retUpperLogic, retLowerLogic);

        inputScanner.close();
    }
    // Methods are defined.
    public static String userString(Scanner inputScanner){
        System.out.printf("Please enter any word:\n");
        String userString = inputScanner.nextLine();

        return userString;
    }
    public static String upperLogic(String userString){
        String toUpperString = userString.toUpperCase();

        return toUpperString;
    }
    public static String lowerLogic(String userString){
        String toLowerString = userString.toLowerCase();

        return toLowerString;
    }
    public static void printAllStrings(String userString, String toUpperString, String toLowerString){
        System.out.printf("First input: (%s)\n", userString);
        System.out.printf("Input in lower cases: (%s)\n",toLowerString);
        System.out.printf("Input in upper cases: (%s)\n", toUpperString);

        return;
    }
}