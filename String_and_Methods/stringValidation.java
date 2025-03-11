package Java_roadmap.String_and_Methods;
import java.util.Scanner;

public class stringValidation {
    public static void main (String [] args){
        Scanner inputScanner = new Scanner(System.in);
        // Methods are called in main.

    }
    // Methods are defined
    public static String username(Scanner inputScanner){
        System.out.printf("Please enter your username\n"):
        String username = inputScanner.nextLine();
        // Clears input buffer, prevents issues with mem.
        inputScanner.nextLine();

        return username;
    }
    // Deletes spaces before and after the input.
    public static String trimUsername(String username){
        String trimmedUsername = username.trim();

        return trimmedUsername;
    }
    public static String tolowerUsername(String trimmedUsername){
        String loweredUsername = trimmedUsername.toLowerCase();
        
        return loweredUsername;
    }
    public 
    public static String email(Scanner inputScanner){
        System.out.printf("Now enter your email\n");
        String email = inputScanner.nextLine();
        
        return email;
    }
}