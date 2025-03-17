package Java_roadmap.Arrays;
import java.util.Scanner;
public class sumArray {
    public static void main (String[] args){
        Scanner inputScanner = new Scanner (System.in);
        int[] retInputArray = inputArray(inputScanner);
        int retSumLogic = sumLogic(retInputArray);
        printSum(retSumLogic);
    }
    // Methods are defined.
    public static int[] inputArray(Scanner inputScanner){
        int[]array = new int [2];
        for (int i = 0; i < 2; i++){
            System.out.printf("Please enter the number (%d/%d)\n", i + 1, 2); 
            array[i] = inputScanner.nextInt();
        }
        return array;
    }
    public static int sumLogic(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
    public static void printSum (int sum){
        System.out.printf("The total sum is equal to: (%d)\n", sum);
        return;
    }
}