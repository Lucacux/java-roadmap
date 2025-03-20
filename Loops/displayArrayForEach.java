package Java_roadmap.Loops;
import java.util.Scanner;
public class displayArrayForEach {
    public static void main (String[] args){
        Scanner inputScanner = new Scanner(System.in);
        int retArraySize = arraySize(inputScanner);
        int[] retPopulateArray = populateArray(inputScanner, retArraySize);
        forEachLogic(retPopulateArray);
        inputScanner.close();
    }
    // Methods are defined
    public static int arraySize(Scanner inputScanner){
        System.out.printf("Please enter the size of the array.\n");
        int arraySize = inputScanner.nextInt();

        return arraySize;
    }
    public static int[] populateArray(Scanner inputScanner, int arraySize){
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            System.out.printf("Please, enter number (%d/%d).\n", i + 1, arraySize);
            array[i] = inputScanner.nextInt();
        }
        return array;
    }
    public static void forEachLogic(int array[]){
        System.out.printf("The elements of the array, printed by a forEach logic are:\n");
        for (int num : array){
            System.out.printf("%d\n", num);
        }
        return;
    }
}