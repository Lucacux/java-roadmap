package Java_roadmap.Arrays;
import java.util.Scanner;
public class findMaxMinInArray {
    public static void main (String[]args){
        Scanner inputScanner = new Scanner(System.in);
        int retArraySize = arraySize(inputScanner);
        int[] retArray = array(inputScanner, retArraySize);
        minArrayLogic(retArray);
        maxArrayLogic(retArray);
        inputScanner.close();
    }
    // Methods are defined.
    public static int arraySize(Scanner inputScanner){
        int arraySize = 0;
        do {
        System.out.printf("Please enter an array size.\n");
        System.out.printf("After that, the program will determinate the min. and max of the array.\n");
        arraySize = inputScanner.nextInt();
        if (arraySize == 0){
            System.out.printf("Error! The array size cannot be equal to 0.\n");
        }
        } while (arraySize == 0);
        return arraySize;
    }
    public static int[] array(Scanner inputScanner, int arraySize){
        int [] array = new int [arraySize];
        for (int i = 0; i < arraySize; i++){
            System.out.printf("Please enter number: (%d/%d).\n", i + 1, arraySize);
            array[i] = inputScanner.nextInt();
        }
        return array;
    }
    public static void minArrayLogic(int[] array){
        // Adjust min. and max. for variable accuracy.
        int min = array[0];
        for (int i = 1; i < array.length; i++){
           if (array[i] < min){
            min = array[i];
           }
        }
        System.out.printf("The lowest value from the array is (%d).\n", min);
        return;
    }
    public static void maxArrayLogic(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.printf("The highest value from the array is (%d).\n",max);
        return;
    }
}