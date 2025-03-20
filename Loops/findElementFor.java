package Java_roadmap.Loops;
import java.util.Scanner;
import java.util.Random;
public class findElementFor {
    public static void main (String[]args){
        Scanner inputScanner = new Scanner(System.in);
        int retArraySize = arraySize(inputScanner);
        int[] retAutoPopulateArray = autoPopulateArray(retArraySize);
        int retInputSearch = inputSearch(inputScanner);
        searchLogic(retArraySize, retAutoPopulateArray, retInputSearch);
        inputScanner.close();
    }
    // Methods are defined
    public static int arraySize(Scanner inputScanner){
        System.out.printf("Please define the array size.\n");
        int arraySize = inputScanner.nextInt();
        return arraySize;
    }
    // Array is auto populated with random util.
    public static int[] autoPopulateArray(int arraySize){
        Random random = new Random();
        int[] array = new int[arraySize];
        for (int i = 0 ; i < arraySize; i++){
            array [i] = random.nextInt(arraySize);
        }
        return array;
    }
    public static int inputSearch(Scanner inputScanner){
        System.out.printf("Please enter the number to search:\n");
        int searchNumber = inputScanner.nextInt();
        return searchNumber;
    }
    public static void searchLogic(int arraySize, int[] array, int searchNumber){
        boolean found = false;
        for (int i = 0; i < arraySize; i++){
            if (array[i] == searchNumber){
                System.out.printf("The number (%d) has been found at position (%d).\n", searchNumber, i);
                found = true;
            }
        }
        if (!found) {
            System.out.printf("The number (%d) is not present in the array.\n", searchNumber);
        }
        return;
    }
}