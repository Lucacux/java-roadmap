package Java_roadmap.Math_Operations;
import java.util.Scanner; 
public class Basic_Arithmetic_Operations {
    public static void main (String[] args){
        Scanner inputScanner = new Scanner(System.in);
        int retFirstNumber = firstNumber(inputScanner);
        int retSecondNumber = secondNumber(inputScanner);
        sumOfNumers(retFirstNumber, retSecondNumber);
        differenceOfNumbers(retFirstNumber, retSecondNumber);
        productOfNumbers(retFirstNumber, retSecondNumber);
        remainderOfNumbers(retFirstNumber, retSecondNumber);
        quotientOfNumbers(retFirstNumber, retSecondNumber);

        inputScanner.close();
    }
    // Methods are defined.
    public static int firstNumber(Scanner inputScanner){
        System.out.printf("Please enter the first number\n");
        int firstNumber = inputScanner.nextInt();

        return firstNumber;
    }
    public static int secondNumber(Scanner inputScanner){
        System.out.printf("Now enter the second number\n");
        // Cleans input buffer, prevents mem issues.
        inputScanner.nextLine();
        int secondNumber = inputScanner.nextInt();

        return secondNumber;
    }
    public static void sumOfNumers(int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        System.out.printf("The sum between (%d) and (%d) is: (%d)\n", firstNumber, secondNumber, sum);
        
        return;
    }
    public static void differenceOfNumbers(int firstNumber, int secondNumber){
        int difference = firstNumber - secondNumber;
        System.out.printf("The difference between (%d) and (%d) is: (%d)\n", firstNumber, secondNumber, difference);

        return;
    }
    public static void productOfNumbers(int firstNumber, int secondNumber){
        int product = firstNumber * secondNumber;
        System.out.printf("The product between (%d) and (%d) is: (%d)\n", firstNumber, secondNumber, product);

        return;
    }
    public static void remainderOfNumbers(int firstNumber, int secondNumber){
        float remainder = firstNumber % secondNumber;
        System.out.printf("The remainder between (%d) and (%d) is: (%f)\n", firstNumber, secondNumber, remainder);
        
        return;
    }
    public static void quotientOfNumbers(int firstNumber, int secondNumber){
        int quotient = firstNumber / secondNumber;
        
        System.out.printf("The quotient between (%d) and (%d) is: (%d)\n", firstNumber, secondNumber, quotient);

        return;
    }

}