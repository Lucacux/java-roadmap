import java.util.Scanner;

public class varAndScopeIV {
    public static void main (String[]args){
        Scanner inputScanner = new Scanner(System.in);
        double retPrice = productPrice(inputScanner);
        double retDiscountPercentage = discountPercentage(inputScanner);
        calculateDiscount(retPrice, retDiscountPercentage);
        inputScanner.close();
    }
    // Methods are defined.
    public static double productPrice(Scanner inputScanner){
        System.out.printf("Please enter the product price\n");
        double productPrice = inputScanner.nextDouble();

        return productPrice;
    }
    public static double discountPercentage(Scanner inputScanner){
        System.out.printf("Now enter the discount percentage\n");
        double discountPercentage = inputScanner.nextDouble();

        return discountPercentage;
    }
    public static void calculateDiscount(double productPrice,double discountPercentage){
        double finalPrice;
        finalPrice = productPrice * (1 - (discountPercentage / 100));
        // Discount validators.
        if (discountPercentage == 0){
            System.out.printf("You didn't had a discount\n");
        } else if (discountPercentage == 100 ){
            System.out.printf("You had a full discount, congrats!\n");
        } else {
            System.out.printf("You applied a (%f) percent discount\n", discountPercentage);
            System.out.printf("Prev. price (%f). Final price (%f)\n", productPrice, finalPrice);
        }
        return;
    }
}