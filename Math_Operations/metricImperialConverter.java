package Java_roadmap.Math_Operations;
import java.util.Scanner;
public class metricImperialConverter {
    public static void main (String [] args){
        Scanner inputScanner = new Scanner(System.in);

        inputScanner.close();
    }
    // Methods are defined.
    public static void menu (Scanner inputScanner){
        int option = 0;
        do {
        System.out.println("🌍 Welcome to the Metric-Imperial Converter! 📏");
        System.out.println("Convert between the most commonly used metric and imperial units with ease.");
        System.out.println("Simply enter the value, choose the unit, and get the equivalent conversion.");
        System.out.println("------------------------------------------------------------");
        System.out.printf("1. Length.\n");
        System.out.printf("2. Mass.\n");
        System.out.printf("3. Volume.\n");
        System.out.printf("4. Exit program");
        option = inputScanner.nextInt();
        switch (option){
            case 1:
            break;
            case 2:
            break;
            case 3:
            break;
            case 4:
            System.out.printf("Keep studying physics!\n");
            break;
            default:
            System.out.printf("Number (%d) is not a valid option!\n", option);
            break;
        }
    } while (option != 4);

        return;
    }
    // LENGTH SECTION.
    // METER TO FEET AND VICEVERSA METHODS.
    // TODO: CHANGE TYPE INT TO DOUBLE FOR SOME FUNCTIONS.
    public static int enterMeterToFeet(Scanner inputScanner){
        int meters;
        System.out.printf("Please enter how many METERS do you want to convert to FEET.\n");
        meters = inputScanner.nextInt();

        return meters;
    }
    public static double meterToFeet(Scanner inputScanner, int meters){
        
        double feet = meters * 3.28084; // 3,28084 is the equivalent of FEET in METERS.

        return feet;
    }
    public static void printFeet(int meters, double feet){
        System.out.printf("(%d) meters are (%f) feet.\n", meters, feet);
        return;
    }
    public static void booleanCalculate(Scanner inputScanner){
        int val = 0;
        System.out.printf("Keep calculating?\n");
        System.out.printf("1 - YES, 0 - CLOSE PROGRAM.\n");
        val = inputScanner.nextInt();
        if (val != 0){
            menu(inputScanner);
        } else {
            System.out.printf("Hope to see you soon!\n");
        }
        return;
    }
    public static double enterFeetToMeter(Scanner inputScanner){

        System.out.printf("Please enter how many FEET do you want to convert to METER.\n");
        double feet = inputScanner.nextDouble();

        return feet;
    }
    public static double feetToMeter(double feet){
        // Types are casted
        double meter =  feet * 0.3048;

        return meter;
    }
    public static void printMeter(double feet, int meter){
        System.out.printf("(%f) feet are equiv(%d) meters.\n", feet, meter);

        return;
    }
    // KM to MILES and viceversa.
    public static double enterKmToMiles(Scanner inputScanner){
        System.out.printf("Please enter how many KM do you want to convert to MILES.\n");
        double km = inputScanner.nextDouble();

        return km;
    }
    public static double kmToMiles(double km){
        double miles = km * 0.6214; // Equivalent of KM in MILES.
        return miles;
    }
    public static void printMiles(double km, double miles){
        System.out.printf("(%f) KM are equivalent to: (%f) MILES.\n", km, miles);
        return;
    }
    public static double enterMilesToKm(Scanner inputScanner){
        System.out.printf("Please enter how many MILES do you want to convert to KM.\n");
        double miles = inputScanner.nextDouble();

        return miles;
    }
    public static double milesToKm(double miles){
        double km = miles * 1.6093;

        return km;
    }
    public static void printKm(double miles, double km){
        System.out.printf("(%f) MILES are equivalent to: (%f) KM.\n", miles, km);
        return;
    }
    // CM to INCHES and viceversa.
    public static double enterCmToInches(Scanner inputScanner){
        System.out.printf("Please enter how many CM do you want to convert to INCHES.\n");
        double cm = inputScanner.nextDouble();

        return cm;
    }
    public static double cmToInches(double cm){
        double inches = cm * 0.3939;

        return inches;
    }
    public static void printInches(double cm, double inches){
        System.out.printf("(%f) CM are  equivalent to: (%f) INCHES.\n", cm, inches);

        return;
    }
    public static double inchesToCm(Scanner inputScanner){
        System.out.printf("Please enter how many INCHES do you want to convert to CM.\n");
        double inches = inputScanner.nextDouble();

        return inches;
    }
    public static double inchesToCm(double inches){
        double cm = inches * 2.54;

        return cm;
    }
    public static void printCm(double inches, double cm){
        System.out.printf("(%f) INCHES are equivalent to: (%f) CM.\n", inches, cm);
        return;
    }
    
}