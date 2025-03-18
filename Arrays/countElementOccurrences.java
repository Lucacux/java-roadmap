package Java_roadmap.Arrays;
import java.util.Scanner;
public class countElementOccurrences {
    public static void main (String[] args){
        Scanner inputScanner = new Scanner(System.in);
        int retInputArraySize = inputArraySize(inputScanner);
        int[] retPopulateArray = populateArray(inputScanner, retInputArraySize);
        ocurrenceLogic(retPopulateArray,retInputArraySize);
    }
    // Methods are defined
    public static int inputArraySize(Scanner inputScanner){
        System.out.printf("Please enter the size of the array.\n");
        System.out.printf("The program will calculate how many nums are repeated.\n");
        int arraySize = inputScanner.nextInt();

        return arraySize;
    }
    public static int[] populateArray(Scanner inputScanner, int arraySize){
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            System.out.printf("Please, enter number (%d/%d).\n", i + 1, arraySize);
            array [i] = inputScanner.nextInt();
        }
        return array;
    }
    public static void ocurrenceLogic(int[] array, int arraySize){
        for (int i = 0; i < arraySize; i++){
            int count = 0;
            for (int j = 0; j < arraySize; j++){
                if (array[i] == array [j]){
                    count++;
                }
            }
        System.out.printf("The number (%d) is repeated (%d) times.\n", array[i], count);
        }
        return;
    }
}