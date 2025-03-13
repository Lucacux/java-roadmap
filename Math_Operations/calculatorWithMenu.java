package Java_roadmap.Math_Operations;
import java.util.Scanner;
public class calculatorWithMenu {
    public static void main (String[] args){
        Scanner inputScanner = new Scanner(System.in);

        menu(inputScanner);

        inputScanner.close();
    }
    // Methods are defined
    public static void askFirstNum(Scanner inputsScanner){
        System.out.printf("Please enter the first number\n");

        return;
    }
    public static void askSecondNum(Scanner inputScanner){
        System.out.printf("Now enter the second number\n");
        return;
    }
    public static void sum(Scanner inputScanner){
        int a, b, sum;

        askFirstNum(inputScanner);
        a = inputScanner.nextInt();
        askSecondNum(inputScanner);
        b = inputScanner.nextInt();

        sum = a + b;

        System.out.printf("The sum between (%d) and (%d) is (%d)\n", a , b, sum);
        
        return;
    }
    public static void substraction(Scanner inputScanner){
        int a, b, substraction;

        askFirstNum(inputScanner);
        a = inputScanner.nextInt();
        askSecondNum(inputScanner);
        b = inputScanner.nextInt();

        substraction = a - b;

        System.out.printf("The substraction between (%d) and (%d) is (%d)\n", a , b , substraction);
        return;
    }
    public static void multiplication(Scanner inputScanner){
        int a, b, multiplication;

        askFirstNum(inputScanner);
        a = inputScanner.nextInt();
        askSecondNum(inputScanner);
        b = inputScanner.nextInt();

        multiplication = a * b;

        System.out.printf("The multiplication between (%d) and (%d) is (%d)\n", a , b, multiplication);
        return;
    }
    public static void division(Scanner inputScanner){
        float a, b, division;
        askFirstNum(inputScanner);
        a = inputScanner.nextFloat();
        askSecondNum(inputScanner);
        b = inputScanner.nextFloat();

        division = a / b;

        System.out.printf("The division between (%f) and (%f) is (%f)\n", a , b, division);
        return;
    }
    public static void modulus(Scanner inputScanner){
        float a, b, modulus, quotient;

        askFirstNum(inputScanner);
        a = inputScanner.nextFloat();
        askSecondNum(inputScanner);
        b = inputScanner.nextFloat();

        quotient = a / b; 
        quotient = (int) quotient;
        modulus = a - (quotient * b);
        
        System.out.printf("The modulus between (%f) and (%f) is (%f)\n", a, b, modulus);

        return;
    }
    public static void menu(Scanner inputScanner){
        int option;
        do {
        System.out.printf("Welcome to JCalculator: An enhanced CLI calculator!\n");
        System.out.printf("Please select an option below:\n");
        System.out.printf("1. Addition\n");
        System.out.printf("2. Substraction\n");
        System.out.printf("3. Multiplication\n");
        System.out.printf("4. Division\n");
        System.out.printf("5. Modulus\n");
        System.out.printf("6. Exit program\n");
        option = inputScanner.nextInt();
        inputScanner.nextLine();
        switch (option){
            case 1:
            sum(inputScanner);
            break;

            case 2:
            substraction(inputScanner);
            break;
            
            case 3:
            multiplication(inputScanner);
            break;

            case 4:
            division(inputScanner);
            break;

            case 5:
            modulus(inputScanner);
            break;

            case 6:
            System.out.printf("Hope to see you soon!\n");
            break;

            default:
            System.out.printf("Please select a number from 1 to 6!\n");
            menu(inputScanner);
            break;
        }
    } while (option != 6);
        return;
    }
} 