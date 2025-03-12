package Java_roadmap.String_and_Methods;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class stringValidation {
    public static void main (String [] args){
        Scanner inputScanner = new Scanner(System.in);
        // Methods are called in main.
        // Username validation.
        String retAskUsername = askUsername(inputScanner);
        String retTrimUsername = trimUsername(retAskUsername);
        String retTolowUsername = tolowerUsername(retTrimUsername);
        String retCapitalizeFist = capitalizeFirst(retTolowUsername);
        String retConcUsername = concatenateUsername(retTolowUsername, retCapitalizeFist);

        // Email validation.
        String retAskEmail = askEmail(inputScanner);
        retAskEmail = emailDirVal(inputScanner, retAskEmail);
        int retAtPosition = findAtPosition(retAskEmail);
        int retDotPosition = dotValAfterAt(inputScanner, retAskEmail, retAtPosition);
        String retLocalPart = localPartEmail(retAskEmail, retAtPosition);
        String retDomainPart = domainPart(retAskEmail, retDotPosition);
        localPartVal(inputScanner, retAskEmail, retLocalPart);
        localPartValChar(inputScanner,retAskEmail, retLocalPart);
        domainPartValChar(inputScanner, retAskEmail, retDomainPart);

        finalVal(inputScanner, retConcUsername, retAskEmail);
        printAll(retConcUsername, retAskEmail);



        inputScanner.close();


    }
    // Methods are defined
    public static String askUsername(Scanner inputScanner){
        System.out.printf("Please enter your username\n");
        String username = inputScanner.nextLine();
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
    public static String capitalizeFirst(String loweredUsername){
        int firstLetter = 0;
        int restOfWord = 1;

        String capitalizedFirst = loweredUsername.substring(firstLetter, restOfWord).toUpperCase(); 

        return capitalizedFirst;
    }
    public static String concatenateUsername(String loweredUsername, String capitalizedFirst){
        String restOfWord = loweredUsername.substring(1).toLowerCase();
        
        String concUsername = capitalizedFirst + restOfWord;
        
        return concUsername;
    }
    public static String askEmail(Scanner inputScanner){
        String email; 
        do {
        System.out.printf("Now enter your email\n");
        email = inputScanner.nextLine().trim();
        if (email.isEmpty()){
            System.out.printf("Error!: Your email cannot be empty.\n");
        }
    } while (email.isEmpty());
        return email;
    }
    public static String emailDirVal(Scanner inputScanner, String email){

        while (!email.contains("@") || !email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            System.out.printf("Your email MUST have an AT char (@).\n");
            email = askEmail(inputScanner);
        }

        return email;
    }
    public static int findAtPosition(String email){
        int atPosition = email.indexOf("@");

        return atPosition;
    }
    public static int dotValAfterAt(Scanner inputScanner,String email, int atPosition){
        int dotPosition = email.indexOf(".", atPosition);

        if (dotPosition == -1) {
            System.out.printf("Error, your email MUST have a valid (.com) domain.\n");
            email = askEmail(inputScanner);
        }
        return dotPosition;
    }
    // Local part is refered to everything that is before an '@' char.
    public static String localPartEmail(String email, int atPosition){
        String localPart = email.substring(0, atPosition);

        return localPart;
    }
    // Domain part is refered to everything that comes after '@' char.
    public static String domainPart(String email, int dotPosition){
        String domainPart = email.substring(dotPosition + 1);
        return domainPart;
    }
    // Local part verifies that evetthing before '@' is not empty.
    public static String localPartVal(Scanner inputScanner, String email, String localPart){
        if (localPart.isEmpty()){
            System.out.printf("Your email before (@) MUST contain a valid username\n");
            email = askEmail(inputScanner);
        }
        return email;
    }
    // localPartValChar verifies that the email direction has valid char values.
    public static String localPartValChar(Scanner inputScanner,String email, String localPart){
        String regex = "^[a-zA-Z0-9]+([._-]?[a-zA-Z0-9]+)*$"; 

        Pattern localPattern = Pattern.compile(regex);
        Matcher localMatcher = localPattern.matcher(localPart);
        if (!localMatcher.matches()){
            System.out.printf("The local part (before '@') cannot contain spaces, consecutive dots, or special symbols.\n");
            System.out.printf("Valid characters: letters, numbers, periods (.), hyphens (-), and underscores (_). Periods can't be at the start/end or consecutive.\n");
            System.out.printf("Example: john.doe_123\n");
            email = askEmail(inputScanner);
        }
        return email;
    }
    public static String domainPartValChar(Scanner inputScanner, String email, String domainPart){
        String regex = "^[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        Pattern domainPattern = Pattern.compile(regex);
        Matcher domainMatcher = domainPattern.matcher(domainPart);
        if (!domainMatcher.matches()){
            System.out.printf("The domain part must follow a valid format: letters, numbers, and hyphens allowed. No spaces or consecutive dots.\n");
            System.out.printf("Example: example.com or sub-domain.example.com\n");
            email = askEmail(inputScanner);
        }
    
        return email;
    }
    public static void finalVal(Scanner inputScanner, String concUsername, String valEmail){
        int val_1, val_2;
        System.out.printf("Your username will be (%s)\n", concUsername);
        System.out.printf("Your email will be (%s)\n", valEmail);
        System.out.printf("CONTINUE? : (1) YES, (0) MAKE CHANGES\n");
        val_1 = inputScanner.nextInt();
        inputScanner.nextLine();
        if (val_1 != 1) {
            System.out.printf("Which changes do you want to do?\n");
            System.out.printf("(1) Change username, (0) Change email\n");
            val_2 = inputScanner.nextInt();
            inputScanner.nextLine();
            if (val_2 != 1) {
                valEmail = askEmail(inputScanner);
            } else {
               concUsername = askUsername(inputScanner);
            }

        }
        return;
    }
    public static void printAll (String concUsername, String valEmail){
        System.out.printf("Sucess!\n");
        System.out.printf("Your username now is (%s)\n", concUsername);
        System.out.printf("And your email now is (%s)\n", valEmail);
        return;
    }
}