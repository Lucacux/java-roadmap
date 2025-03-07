// Library for scanning is imported
import java.util.Scanner;
public class varAndScope {
    // Main method
    public static void main (String[]args){
        Scanner inputScanner = new Scanner(System.in);
        String ret_str = askName(inputScanner);
        int ret_age = askAge(inputScanner,ret_str);
        float ret_age_in_months = calculateAgeInMonths(inputScanner, ret_age);
        printAll(ret_str, ret_age,ret_age_in_months);
        inputScanner.close();
    }
    // Methods for main are defined.
    public static String askName(Scanner inputScanner){
        System.out.printf("Welcome, user! Please enter your name\n");
          String name = inputScanner.nextLine();

         return name;
    }
    public static int askAge(Scanner inputScanner, String name){
        System.out.printf("Now enter your age, (%s).\n", name);
        int age = inputScanner.nextInt();
        return age;
    }
    public static float calculateAgeInMonths(Scanner inputScanner, int age){
        float ageInMonths = age * 12; // 12 equals to total amount of months in a year.

        return ageInMonths;
    }
    public static void printAll(String name, int age, float ageInMonths){
        System.out.printf("Your name is (%s), and you're (%d) years old\n", name, age);
        System.out.printf("Your age in months is (%f)\n", ageInMonths);
        return;
    }
}