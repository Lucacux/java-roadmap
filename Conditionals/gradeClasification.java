package Java_roadmap.Conditionals;
import java.util.Scanner;
public class gradeClasification {
    public static void main (String [] args){
        Scanner inputScanner = new Scanner(System.in);
        int retGrade = grade(inputScanner);
        gradeLogic(retGrade);
        inputScanner.close();
    }
    // Methods are defined.
    public static int grade(Scanner inputScanner){
        System.out.printf("Please enter a grade to check the student's note.\n");
        int grade = inputScanner.nextInt();
        return grade;
    }
    public static void gradeLogic(int grade){
        if (grade > 90 && grade <= 100){
            System.out.printf("The student has got an A (Numeric grade: %d).\n", grade);
        } else if (grade > 80 && grade <= 89){
            System.out.printf("The student has got a B (Numeric grade: %d).\n", grade);
        } else if (grade > 70 && grade <= 79){
            System.out.printf("The student has got a C (Numeric grade: %d).\n", grade);
        } else if (grade > 60 && grade <= 69){
            System.out.printf("The student has got a D (Numeric grade: %d).\n", grade);
        } else {
            System.out.printf("The student has got an F (Numeric grade: %d).\n", grade);
        }
        return;
    }
}