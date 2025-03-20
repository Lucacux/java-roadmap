package Java_roadmap.Loops;
import java.util.Scanner;
public class sumNaturalNumbersFor {
    public static void main (String[] args){
        Scanner inputScanner = new Scanner(System.in);
        int retInputNumber = inputNumber(inputScanner);
        int retSumNaturalNumbers = sumNaturalNumbers(retInputNumber);
        printNaturalSum(retInputNumber, retSumNaturalNumbers);
        inputScanner.close();
    }
    // Methods are defined
    public static int inputNumber(Scanner inputScanner){
        int naturalNumber = 0;
        do {
            System.out.printf("Please enter a positive natural number.\n");
            naturalNumber = inputScanner.nextInt();
            if (naturalNumber <= 0){
                System.out.printf("ERROR!: Your number cannot be negative or equal to zero.\n");
            }
        } while (naturalNumber <= 0);

        return naturalNumber;
    }
    public static int sumNaturalNumbers(int naturalNumber){
        int naturalSum = 0;
        for (int i = 1; i <= naturalNumber; i++){
            naturalSum += i;
        }
        return naturalSum;
    }
    public static void printNaturalSum(int naturalNumbers, int naturalSum){
        System.out.printf("The total sum of the first (%d) numbers is (%d).\n", naturalNumbers, naturalSum);
        return;
    }
}