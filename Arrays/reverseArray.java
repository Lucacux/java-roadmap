package Java_roadmap.Arrays;
import java.util.Scanner;
public class reverseArray {
    public static void main (String[] args){
        Scanner inputScanner = new Scanner(System.in);
        int retInputArray = inputArraySize(inputScanner);
        int [] retPopulateArray = populateArray(inputScanner, retInputArray);
        invertArrrayValues(retPopulateArray, retInputArray);
        inputScanner.close();
    }
    // Methods are defined
    public static int inputArraySize(Scanner inputScanner){
        System.out.printf("Please enter the size of the array\n");
        int arraySize = inputScanner.nextInt();

        return arraySize;
    }
    public static int[] populateArray(Scanner inputScanner, int arraySize){
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            System.out.printf("Please enter the number (%d/%d).\n", i + 1, arraySize);
            array [i] = inputScanner.nextInt();
        }
        return array;
    }
    public static void invertArrrayValues(int[] array, int arraySize){
        for (int i = arraySize - 1; i >= 0; i--){
            System.out.printf("The inverted values are (%d).\n", array[i]);
        }
        return;
    }
}