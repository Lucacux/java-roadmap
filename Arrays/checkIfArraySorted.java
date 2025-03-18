package Java_roadmap.Arrays;
import java.util.Scanner;
public class checkIfArraySorted {
    public static void main (String[] args){
        Scanner inputScanner = new Scanner(System.in);
        int retInputArraySize = inputArraySize(inputScanner);
        int[] retPopulateArray = populateArray(inputScanner, retInputArraySize);
        int[] retBubbleSorting = bubbleSorting(retInputArraySize, retPopulateArray);
        printSortedArray(retInputArraySize, retBubbleSorting);
        checkIfSorted(retInputArraySize, retPopulateArray);
        boolean retCheckIfSorted = checkIfSorted(retInputArraySize, retPopulateArray);
        printBooleanSort(retCheckIfSorted);
        inputScanner.close();
    }
    // Methods are defined.
    public static int inputArraySize(Scanner inputScanner){
        System.out.printf("Please enter the size of the array.\n");
        int arraySize = inputScanner.nextInt();

        return arraySize;
    }
    public static int[] populateArray(Scanner inputScanner, int arraySize){
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            System.out.printf("Please enter number (%d/%d)\n", i + 1, arraySize);
            array [i] = inputScanner.nextInt();
        }
        return array;
    }
    public static int[] bubbleSorting(int arraySize, int[] array){
        for (int i = 0; i < arraySize -1; i++){
            for (int j = 0; j < arraySize - i - 1; j++){
                if (array[j] > array[j + 1]){
                    int temp = array [j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    public static void printSortedArray(int arraySize, int[] sortedArray){
        System.out.printf("Array sorted by bubble sorting:\n");
        for (int i = 0; i < arraySize; i ++){
            System.out.printf("Number (%d/%d): (%d).\n", i + 1, arraySize, sortedArray[i]);
        }
        return;
    }
    // Note: The array should ALWAYS be sorted. Otherwise, the bubblesort failed.
    public static boolean checkIfSorted(int arraySize, int[] array){
        boolean isSorted = true;
        for (int i = arraySize -2; i >= 0; i--){
            if (array[i] > array[i + 1]){
                isSorted = false;
            } else {
                isSorted = true;
            }
        }
        return isSorted;
    }
    public static void printBooleanSort(boolean isSorted){
        if (isSorted != false){
            System.out.printf("The array is properly sorted.\n");
        } else {
            System.out.printf("The array isn't sorted.\n");
        }
        return;
    }
}