import java.util.Scanner;

public class varAndScopeIII {
    public static void main(String[]args) {
        Scanner inputScanner = new Scanner(System.in);
        String retName = enterName(inputScanner);
        String retRole = role(inputScanner, retName);
        checkPermissions(retName, retRole);
    }
    // Methods are defined.
    public static String enterName(Scanner inputScanner) {
        System.out.printf("Please enter your name\n");
        String name = inputScanner.nextLine();

        inputScanner.close();
        return name;
    }
    public static String role(Scanner inputScanner, String name){
        System.out.printf("Now enter your role, (%s)\n", name);
        System.out.printf("Available roles: Admin, User and Guest\n");
        String role = inputScanner.nextLine().toUpperCase();

        return role;
    }
    public static void checkPermissions(String name, String role){

        if (role.equals ("ADMIN")){
            System.out.printf("Welcome back (%s), you have total access to the system\n", name);
        } else if (role.equals ("USER")){
            System.out.printf("Hello (%s), you have partial access to the system\n", name);
        } else {
            System.out.printf("Hello (%s), you have only READ access to the system\n", name);
        }

        return;
    }
}