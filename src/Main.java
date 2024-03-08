import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variables
        Scanner in = new Scanner(System.in);
        double meters = 0.0;
        double miles = 0.0;
        double feet = 0.0;
        double inches = 0.0;
        boolean done = false;
        String trash = "";


        do {
            System.out.println("Enter a measurement in meters: ");
            if (in.hasNextDouble()) {
                // Success
                meters = in.nextDouble();
                done = true;
            } else {
                // Fail
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid measurement in meters.");
            }

        } while (!done);

        // Results
        miles = meters * 0.00062137;
        System.out.println("Your measurement in miles is " + miles);
        feet = meters * 3.28084;
        System.out.println("Your measurement in feet is " + feet);
        inches = meters * 39.26;
        System.out.println("Your measurement in inches is " + inches);

    }
}