package Java_roadmap.Math_Operations;
import java.util.Scanner;
public class exponentialCalculator {
    public static void main (String [] args){
        Scanner inputScanner = new Scanner(System.in);
        int retBase = enterBase(inputScanner);
        int retExponent = enterExponent(inputScanner, retBase);
        int retExponentiationLogic = exponentiationLogic(retBase, retExponent);
        printAll(retBase, retExponentiationLogic);

        inputScanner.close();
    }
    // Methods are defined
    public static int enterBase(Scanner inputScanner){
        System.out.printf("Please enter the base of the number\n");
        int base = inputScanner.nextInt();

        return base;
    }
    public static int enterExponent(Scanner inputScanner, int base){

        System.out.printf("Now enter the exponent of (%d)\n", base);
        int exponent = inputScanner.nextInt();

        return exponent;

    }
    public static int exponentiationLogic(int base, int exponent){
        int exponentation = 1;

        for (int i = 0; i < exponent; i++) {
        exponentation *= base;
        }
        return exponentation;
    }
    public static void printAll(int base, int exponentiation){
        System.out.printf("The exponentiation of the number (%d) is (%d)\n", base, exponentiation);
        return;
    }

}