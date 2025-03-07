import java.util.Scanner;

public class varAndScopeII {
    public static void main(String[]args){
        Scanner inputScanner = new Scanner(System.in);
        int retNumber = enterInt(inputScanner);
        intLogic(retNumber);
        inputScanner.close();
    }
    // Methods are defined.
    public static int enterInt(Scanner inputScanner){
        System.out.printf("Please enter any number (int)\n");
        int number = inputScanner.nextInt();

        return number;
    }
    public static void intLogic(int number){
        int x = number;
        if (x > 5){
            int y = 20;
            System.out.printf("Now the number equals to (%d)\n", y);
        }
        // It is impossible to print Y because it is a Scope. 
        // Each variable declared inside a scope cannot be used outside it.
        System.out.printf("The number entered was (%d)\n", number);
        return;
    }
}