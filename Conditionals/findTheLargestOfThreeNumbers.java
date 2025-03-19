package Java_roadmap.Conditionals;
import java.util.Scanner;
public class findTheLargestOfThreeNumbers {
    public static void main (String[] args){
        Scanner inputScanner = new Scanner(System.in);
        int[] retInputNumbers = inputNumbers(inputScanner);
        largestOfThreeLogic(retInputNumbers);
        inputScanner.close();
    }
    // Methods are defined
    public static int [] inputNumbers(Scanner inputScanner){
        int[] array = new int [3];
        for (int i = 0; i < 3; i++){
            System.out.printf("Please enter number (%d/%d).\n", i + 1, 3);
            array [i] = inputScanner.nextInt();
        }
        return array;
    }
    public static void largestOfThreeLogic(int[] array){
        // If the first value is larger than the second and third value...
        if (array[0] > array[1] && array [0] > array[2]){
            System.out.printf("The FIRST value (%d).\n", array[0]);
            System.out.printf("Is larger than the SECOND VALUE: (%d) and the THIRD VALUE: (%d).\n", array[1], array[2]);

            // Otherwise if the second value is larger than the first and the third value...
        } else if (array[1] > array[0] && array[1] > array[2]){
            System.out.printf("The SECOND value (%d).\n", array[1]);
            System.out.printf("Is larger than the FIRST VALUE: (%d) and the THIRD VALUE: (%d).\n", array[0], array[2]);

            // Otherwise, if the third value is larger than the second and first value...
        } else if (array[2] > array[1] && array [2] > array[0]){
            System.out.printf("The THIRD VALUE (%d).\n", array[2]);
            System.out.printf("Is larger than the SECOND VALUE: (%d) and the FIRST VALUE: (%d).\n", 
            array[1],array[0]);
            //Otherwise if all of the three numbers are equal to zero.
        } else if (array [0] == 0 && array[1] == 0 && array[2] == 0){
            System.out.printf("All of the three numbers are EQUAL to 0.\n");
        }

        return;
    }
}