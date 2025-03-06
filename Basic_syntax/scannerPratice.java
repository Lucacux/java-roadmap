import java.util.Scanner;

public class scannerPratice {

  public static void main (String[] args) {
  // Class Scanner is defined for input.
  Scanner inputScanner = new Scanner(System.in);
  // Method askName is returned.
  String ret_name = askName(inputScanner);
  // Method askAge is returned.
  int ret_age = askAge(inputScanner,ret_name);
  printData(ret_name, ret_age);
  // Scanner Class is closed after calling all methods.
  inputScanner.close();
  }
// Methods are defined.
public static String askName(Scanner inputScanner) {
  System.out.printf("Welcome, user! Please enter your name\n");
  String name = inputScanner.nextLine();

  return name;
}
 public static int askAge(Scanner inputScanner, String name) {
  System.out.printf("(%s), now please enter your age!\n", name);
  int age = inputScanner.nextInt();

  return age;
}
public static void printData(String name, int age) {

  System.out.printf("Hello, (%s) you're (%d) years old.\n",name, age);

  return;

}

}

