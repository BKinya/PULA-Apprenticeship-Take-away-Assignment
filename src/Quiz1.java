import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create a program that asks the user to enter their name and age. The program should then print
 * out the name, year and age from the current year, in multiples of 7 until they reach 100 years.
 */
public class Quiz1 {
    public static void main(String[] args) {
        int year = Calendar.getInstance().get(Calendar.YEAR);

        //user input: name and age
        Scanner mScanner = new Scanner(System.in);
        try {
            System.out.println("Enter your name");
            String name = mScanner.nextLine();
//
            System.out.println("Enter your age");
            int age = mScanner.nextInt();
            System.out.println(name + " in " + year + " your age is " + age + " years");

            //check if age is a multiple of 7
            // if it's not increment until you get the nearest multiple of 7
            while (age % 7 != 0) {
                ++age;
                ++year;
            }
            //print age in multiples of 7 until it is 100 years
            incrementAge(name, age, year);

        } catch (InputMismatchException e) {
            System.out.println("Age in numbers is required");
        } catch (Exception e) {
            System.out.println("Age is required");
        }
    }

    /**
     * @param age
     * @param year
     */
    public static void incrementAge(String name, int age, int year) {
        do {
            System.out.println(name + " in " + year + " your age is " + age + " years");
            year += 7;
            age += 7;
        } while (age < 100);

        System.out.println(name + " in " + (year + (100 - age)) + " your age is 100 years");
    }
}
