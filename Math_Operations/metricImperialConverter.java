package Java_roadmap.Math_Operations;
import java.util.Scanner;
public class metricImperialConverter {
    public static void main (String [] args){
        Scanner inputScanner = new Scanner(System.in);
        menu(inputScanner);
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
            length(inputScanner);
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
    public static double enterMeterToFeet(Scanner inputScanner){
        System.out.printf("Please enter how many METERS do you want to convert to FEET.\n");
        double meters = inputScanner.nextDouble();

        return meters;
    }
    public static double meterToFeet(Scanner inputScanner, double meters){
        
        double feet = meters * 3.28084; // 3,28084 is the equivalent of FEET in METERS.

        return feet;
    }
    public static void printFeet(double meters, double feet){
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

        double meter =  feet * 0.3048;

        return meter;
    }
    public static void printMeter(double feet, double meter){
        System.out.printf("(%f) FEET are equivalent to: (%f) METERS.\n", feet, meter);

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
    public static double enterInchesToCm(Scanner inputScanner){
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
    // MASS SECTION
    // KG TO LB AND VICERVERSA METHODS ARE DEFINED.
    public static double enterKgToLb(Scanner inputScanner){
        System.out.printf("Please enter how many KG do you want to convert to LB.\n");
        double kg = inputScanner.nextDouble();

        return kg;
    }
    public static double KgToLb(double kg){
        double lb = kg * 2.2046; 
        return lb;
    }
    public static void printLb(double kg, double lb){
        System.out.printf("(%f) KG are equivalent to: (%f) LB.\n", kg, lb);

        return;
    }
    public static double enterLbToKg(Scanner inputScanner){
        System.out.printf("Please enter how many LB do you want to convert to KG.\n");
        double lb = inputScanner.nextDouble();
        return lb;
    }
    public static double lbToKg(double lb){
        double kg = lb * 0.4536;

        return kg;
    }
    public static void printKg(double lb, double kg){
        System.out.printf("(%f) LB are equivalent to: (%f) KG.\n", lb, kg);
        return;
    }
    // OZ to GR AND VICEVERSA METHODS ARE DEFINED.
    public static double enterOzToGr(Scanner inputScanner){
        System.out.printf("Please enter how many OZ do you want to convert to GR.\n");
        double oz = inputScanner.nextDouble();

        return oz;
    }
    public static double ozToGr(double oz){
        double gr = oz * 28.3495;

        return gr;
    }
    public static void printGr(double oz, double gr){
        System.out.printf("(%f) OZ are equivalent to: (%f) GR.\n", oz, gr);
        return;
    }
    public static double enterGrtoOz(Scanner inputScanner){
        System.out.printf("Please enter how many GR do you want to convert to OZ.\n");
        double gr = inputScanner.nextDouble();
        return gr;
    }
    public static double grToOz(double gr){
        double oz = gr * 0.0353;
        return oz;
    }
    public static void printOz(double gr, double oz){
        System.out.printf("(%f) GR are quivalent to: (%f) OZ.\n", gr, oz);
        return;
    }
    // LITERS TO LIQUID OZ AND VICEVERSA METHODS ARE DEFINED.
    public static double enterLtoLiquidOunces(Scanner inputScanner){
        System.out.printf("Please enter how many liters do you want to convert to liquid ounces\n");
        double liters = inputScanner.nextDouble();
        return liters;
    }
    public static double lToOunces(double liters){
        double liquidOz = liters * 33.814;
        return liquidOz;
    }
    public static void printLiquidOunces(double l, double liquidOunces){
        System.out.printf("(%f) LITERS are quivalent to: (%f) LIQUID OUNCES\n", l, liquidOunces);

        return;
    }
    public static double enterLiquidOuncesToLiters(Scanner inputScanner){
        System.out.printf("Please enter how many LIQUID OUNCES do you want to convert to LITERS\n");
        double liquidOunces = inputScanner.nextDouble();

        return liquidOunces;
    }
    public static double ouncesToLiters(double liquidOunces){
        double liters = liquidOunces * 0.0295735;

        return liters;
    }
    public static void printLiters(double liquidOunces, double liters){
        System.out.printf("(%f) LIQUID OUNCES are equivalent to: (%f) LITERS\n", liquidOunces, liters);
        return;
    }
    // MILILITERS TO LIQUID OUNCES AND VICEVERSA METHODS ARE DEFINED.
    public static double enterMililitersToLiquidOunces(Scanner inputScanner){
        System.out.printf("Please enter how many MILILITERS do you want to convert to LIQUID OUNCES\n");
        double mililiters = inputScanner.nextDouble();

        return mililiters;
    }
    public static double MililitersToLiquidOunces(double mililiters){
        double liquidOunces = mililiters * 0.0338;
        return liquidOunces;
    }
    public static void printLiquidOuncesmM(double mililiters, double liquidOunces){
        System.out.printf("(%f) MILILITERS are equivalent to: (%f) LIQUID OUNCES\n", mililiters, liquidOunces);
        return;
    }
    public static double enterLiquidOuncesToMililiters(Scanner inputScanner){
        System.out.printf("Please enter how many LIQUID OUNCES do you want to convert to MILILITERS\n");
        double liquidOunces = inputScanner.nextDouble();
        return liquidOunces;
    }
    public static double liquidOuncesToMm(double liquidOunces){
        double mililiters = liquidOunces * 29.5735; 

        return mililiters; 
    }
    public static void printMililiters(double liquidOunces, double mililiters){
        System.out.printf("(%f) LIQUID OUNCES are equivalent to: (%f) MILILITERS\n", liquidOunces, mililiters);
        return;
    }
    // GALLONS to LITERS AND VICEVERSA METHODS
    public static double enterGallonsToLiters(Scanner inputScanner){
        System.out.printf("Please enter how many GALLONS do you want to convert LITERS\n");
        double gallons = inputScanner.nextDouble();
        return gallons;
    }
    public static double gallonsToLiters(double gallons){
        double liters = gallons * 3.7854; 
        return liters;
    }
    public static void printLitersFromGallons(double gallons, double liters){
        System.out.printf("(%f) GALLONS are equivalent to: (%f) LITERS\n", gallons, liters);

        return;
    }
    public static double enterLitersToGallons(Scanner inputScanner){
        System.out.printf("Please enter how many LITERS do you want to convert to GALLONS\n");
        double liters = inputScanner.nextDouble();
        return liters;
    }
    public static double litersToGallons(double liters){
        double gallons = liters * 0.264172;

        return gallons;
    }
    public static void printGallonsFromLiters(double liters, double gallons){
        System.out.printf("(%f) LITERS are equivalent to (%f) GALLONS\n", liters, gallons);
        return;
    }
    // ALL LOGIC METHODS ARE MADE FOR BEING CONNECTED TO MAIN METHODS LIKE LENGTH OR MASS.
    // METER TO FEET LOGIC AND VICEVERSA METHODS ARE DEFINED.
    public static void meterToFeetLogic(Scanner inputScanner){
        double retInputMeterToFeet = enterMeterToFeet(inputScanner);
        double retMeterToFeet = meterToFeet(inputScanner, retInputMeterToFeet);
        printFeet(retInputMeterToFeet, retMeterToFeet);
        booleanCalculate(inputScanner);
        return;
    }
    public static void feetToMeterLogic(Scanner inputScanner){
        double retInputFeetToMeter = enterFeetToMeter(inputScanner);
        double retFeetToMeter = feetToMeter(retInputFeetToMeter);
        printMeter(retInputFeetToMeter, retFeetToMeter);
        return;
    }
    // KM TO MILES LOGIC AND VICEVERSA METHODS ARE DEFINED.
    public static void kmToMilesLogic(Scanner inputScanner){
        double retInputKmToMiles = enterKmToMiles(inputScanner);
        double retKmToMiles = kmToMiles(retInputKmToMiles);
        printMiles(retInputKmToMiles, retKmToMiles);
        booleanCalculate(inputScanner);
        return;
    }
    public static void milesToKmLogic(Scanner inputScanner){
        double retInputMilesToKm = enterMilesToKm(inputScanner);
        double milesToKm = milesToKm(retInputMilesToKm);
        printMiles(retInputMilesToKm, milesToKm);
        booleanCalculate(inputScanner);
        return;
    }
    // CM TO INCHES LOGIC AND VICEVERSA METHODS ARE DEFINED.
    public static void cmToInchesLogic(Scanner inputScanner){
        double retEnterCmToInches = enterCmToInches(inputScanner);
        double retCmToInches = cmToInches(retEnterCmToInches);
        printInches(retEnterCmToInches, retCmToInches);
        booleanCalculate(inputScanner);
        return;
    }
    public static void inchesToCmLogic(Scanner inputScanner){
        double retEnterInchesToCm = enterInchesToCm(inputScanner);
        double retInchesToCm = inchesToCm(retEnterInchesToCm);
        printCm(retEnterInchesToCm, retInchesToCm);
        booleanCalculate(inputScanner);

        return;
    }
    // MAIN METHODS (LIKE LENGTH) ARE DEFINED.
    public static void length(Scanner inputScanner){
        int option = 0;
        do {
        System.out.printf("Please select an option\n");
        System.out.printf("(1). Meter to feet.\n");
        System.out.printf("(2). Feet to meter.\n");
        System.out.printf("-------------------\n");
        System.out.printf("(3). Kilometer to mile.\n");
        System.out.printf("(4). Mile to Kilometer.\n");
        System.out.printf("-----------------------\n");
        System.out.printf("(5) Centimeter to inches.\n");
        System.out.printf("(6). Inches to Centimeters\n");
        System.out.printf("(7). Back to Main menu.\n")
        option = inputScanner.nextInt();

        switch(option){
            case 1:
            meterToFeetLogic(inputScanner);
            break;

            case 2:
            feetToMeterLogic(inputScanner);
            break;

            case 3:
            kmToMilesLogic(inputScanner);
            break;

            case 4:
            milesToKmLogic(inputScanner);
            break;
            
            case 5:
            cmToInchesLogic(inputScanner);
            break;

            case 6:
            inchesToCmLogic(inputScanner);
            break;

            case 7:
            menu(inputScanner);
            break;

            default:
            System.out.printf("Sorry! That's not a valid option.\n");
            break;
        }
    } while (option != 7);
        return;
    }
    
}