package Java_roadmap.String_and_Methods;
import java.util.Scanner;
public class adavancedStringOps {
    public static void main (String [] args){
        Scanner inputScanner = new Scanner(System.in);
        menu(inputScanner);
    }
    // Methods are defined.
    public static String enterString (Scanner inputScanner){
        System.out.printf("Please enter a sentence:\n");
        String inputString = inputScanner.nextLine();

        return inputString;
    }
    public static int inputStartIndex(Scanner inputScanner){
        System.out.printf("Enter a start index for substring\n");
        int startIndex = inputScanner.nextInt();
        return startIndex;
    }
    public static int inputEndIndex(Scanner inputScanner){
        System.out.printf("Enter an end index for substring\n");
        int endIndex = inputScanner.nextInt();
        return endIndex;
    }
    public static char charData(Scanner inputScanner){
        System.out.printf("Enter a char to search:\n");
        char charData = inputScanner.next().charAt(0);
        return charData;
    }
    public static String containsString(Scanner inputScanner){
        System.out.printf("Enter a word to search:\n");
        inputScanner.nextLine(); // Cleans input buffer and prevents issues.
        String containsStr = inputScanner.nextLine();

        return containsStr;
    }
    public static String substringLogic(String inputString, int startIndex, int endIndex){
        String subString = inputString.substring(startIndex,endIndex);

        return subString;
    }
    public static boolean stringLogic (String inputString, char isChar){
        boolean containsString = inputString.contains(String.valueOf(isChar));

        return containsString;
    }
    public static int searchPositionChar (String inputString, String containsStr){   
        int charPosition = inputString.indexOf(containsStr);

        return charPosition;
    }
    public static void substring(Scanner inputScanner){
        String retEnterString = enterString(inputScanner);
        int retStartIndex = inputStartIndex(inputScanner);
        int retEndIndex = inputEndIndex(inputScanner);
        String retSubString = substringLogic(retEnterString, retStartIndex, retEndIndex);

        System.out.printf("Substring extracted: (%s)\n", retSubString);

        return;
    }
    public static void searchCharacter(Scanner inputScanner){
        String retEnterString = enterString(inputScanner);
        char retCharData = charData(inputScanner);
        boolean containsChar = stringLogic(retEnterString, retCharData);
        if (containsChar) {
            int charPosition = retEnterString.indexOf(retCharData);
            System.out.printf("The character '%c' found at position: %d\n", retCharData, charPosition);
        } else {
            System.out.printf("The character '%c' was not found.\n", retCharData);
        }
        return;
    }
    public static void booleanChar(Scanner inputScanner){
        String retEnterString = enterString(inputScanner);
        char retCharData = charData(inputScanner);
        boolean containsChar = stringLogic(retEnterString, retCharData);
        System.out.printf("Contains character: %b\n", containsChar);
        return;
    }
    public static void menu(Scanner inputScanner){
        int option;
        do {
            System.out.printf("Please select an option\n");
            System.out.printf("1. Search substring.\n");
            System.out.printf("2. Search character position\n");
            System.out.printf("3. Check if character is present\n");
            System.out.printf("4. Exit program\n");
            option = inputScanner.nextInt();
            inputScanner.nextLine(); // Prevents input buffer issues

            switch(option){
                case 1:
                    // Calls substring method.
                    substring(inputScanner);
                    break;
                case 2:
                    // Calls character position method.
                    searchCharacter(inputScanner);
                    break;
                case 3:
                    // Calls boolean check for character presence.
                    booleanChar(inputScanner);
                    break;
                default:
                    // Exits program
                    System.out.printf("See you later!\n");
                    break;
            }
        } while (option != 4);
        return;
    }
}
