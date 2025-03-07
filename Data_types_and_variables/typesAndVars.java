/*
 * Java-Variables-Array-Example - A simple Java program demonstrating the use of variables and arrays.
 *
 * This program declares a few variables, including an integer variable for age, a String variable for the user's name,
 * and an integer array to store five numbers. It then prints a personalized message with the user's name and age,
 * followed by a loop that prints each number from the array.
 *
 * Features:
 * - Declare and assign values to variables
 * - Print a personalized message using variables
 * - Declare and use an integer array
 * - Iterate through an array using a for loop
 *
 * Author: Luca "Lucacux" Lombardo
 * Date: 06-03-2025
 */

// Libraries are imported
import java.util.Scanner;

public class typesAndVars {

  public static void main(String [] args) {
    Scanner inputScanner = new Scanner(System.in);
    String ret_name = enterName(inputScanner);
    int ret_age = enterAge(inputScanner, ret_name);
    int[] ret_arr = enterArray(inputScanner);
    printAll(ret_name, ret_age, ret_arr);

    inputScanner.close();
  }

  // Method to ask the user for their name
  public static String enterName(Scanner inputScanner) {
    System.out.printf("Hello user! please enter your name\n");
    String name = inputScanner.nextLine();
    return name;
  }

  // Method to ask the user for their age
  public static int enterAge(Scanner inputScanner, String name){
    System.out.printf("Now please enter your age, %s\n", name);
    int age = inputScanner.nextInt();
    inputScanner.nextLine(); // consume the newline character left by nextInt()
    return age;
  }

  // Method to ask the user for 5 numbers and return them as an array
  public static int[] enterArray(Scanner inputScanner) {
    int numbers = 5;
    int[] array = new int[numbers];
    System.out.printf("Finally, please enter %d numbers\n", numbers);
    for (int i = 0; i < numbers; i++) {
      array[i] = inputScanner.nextInt();
    }
    return array;
  }

  // Method to print the name, age, and the numbers in the array
  public static void printAll(String name, int age, int[] array) {
    System.out.printf("Your name is (%s)\n", name);
    System.out.printf("You're (%d) years old\n", age);

    for (int i = 0; i < array.length; i++) {
      System.out.printf("Number (%d): %d\n", i + 1, array[i]);
    }
      return;
  }
}
