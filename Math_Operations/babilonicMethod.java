package Java_roadmap.Math_Operations;
import java.util.Scanner;

public class babilonicMethod {
    public static void main (String [] args){
        Scanner inputScanner = new Scanner(System.in);
        int retNumber = enterNumber(inputScanner);
        int retEstimation = enterEstimation(inputScanner, retNumber);
        double retBabilonianMethod = babilonianMethod(retNumber, retEstimation);
        printAll(retNumber, retEstimation, retBabilonianMethod);
    }
    // Methods are defined
    public static int enterNumber(Scanner inputScanner){
        int n = 0;
        do {
        System.out.printf("Please enter an (n) number to calculate its square root.\n");
        n = inputScanner.nextInt();

        if (n <= 0){
            System.out.printf("Error! Your number MUST be positive.\n");
        }

    } while (n <= 0);

        return n;
    }
    public static int enterEstimation(Scanner inputScanner, int n){
        int estimation = 0;
        do {
        System.out.printf("Now enter an estimation for the number (%d).\n", n);
        estimation = inputScanner.nextInt();
        if (estimation <= 0){
            System.out.printf("ERROR! You cannot divide a number by 0.\n");
        }
        
    } while (estimation <= 0);

        return estimation;
    }
    public static double babilonianMethod(int n, int estimation){
        double epsilon = 0.001; // Adjust 'epsilon' for more or less accuracy per iteration.
        double closestEstimation = 0;
        
        do { 
           closestEstimation = 0.5 * (estimation + (n / estimation));
           estimation = (int) closestEstimation;
           // Absolute difference greater than or equal to epsilon.
        } while ((closestEstimation - estimation) >= epsilon || (estimation - closestEstimation)>=epsilon);

        return closestEstimation;
    }
    public static void printAll(int n, int estimation, double closestEstimation){
        System.out.printf("The square root of the number (%d) estimated by (%d) is (%f)\n", n, estimation, closestEstimation);
        return;
    }
}