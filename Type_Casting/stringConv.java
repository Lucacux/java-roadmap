package Java_roadmap.Type_Casting;
import java.util.Scanner;

public class stringConv{
    public static void main (String[]args){
        Scanner inputScanner = new Scanner(System.in);
        String retNumberString = numberString(inputScanner);
        int retConvString = convString(retNumberString);
        double retConvCastedString = convCastedString(retConvString);
        printAllValues(retNumberString, retConvString, retConvCastedString);

        inputScanner.close();
    }
    // Methods are defined
    public static String numberString(Scanner inputScanner){
        System.out.printf("Please enter a few numbers (Ex. 1,2,3).\n");
        String numberString = inputScanner.nextLine();
        return numberString;
    }
    public static int convString(String numberString){
        // Casting string with unconventional conversion method.
        int castedString = Integer.parseInt(numberString);
        return castedString;
    }
    public static double convCastedString(int castedString){
        double twoTimesCast = (double) castedString;
        return twoTimesCast;
    }
    public static void printAllValues(String numberString, int castedString, double twoTimesCast){
        System.out.printf("String (non-casted): (%s)\n", numberString);
        System.out.printf("Integer value (casted once) (%d)\n", castedString);
        System.out.printf("Double value (casted twice): (%f)\n", twoTimesCast);
        return;
    }
}