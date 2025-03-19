package Java_roadmap.Conditionals;
import java.util.Scanner;
public class leapYearCheck {
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        int retInputYear = inputYear(inputScanner);
        leapYearLogic(retInputYear);
        inputScanner.close();
    }
    // Methods are defined
    public static int inputYear(Scanner inputScanner){
        System.out.printf("Please enter a year to check if it is a leap year.\n");
        int year = inputScanner.nextInt();
        return year;
    }
    public static void leapYearLogic(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.printf("(%d) is a leap year.\n", year);
        } else {
            System.out.printf("(%d) is not a leap year.\n", year);
        }
    }
}