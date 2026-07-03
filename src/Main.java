import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // User Answers
        int userChoice = 0;
        int processAccount = 0;

        do {
            System.out.println("Welcome to the Bank of Rafael");

            // User Login and Account Creation
            do {

                try {
                    System.out.println("1. Login Account\n2. Create Account");
                    System.out.print("Answer: ");
                    processAccount = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Input must be a number");
                }

                if (processAccount != 1 || processAccount != 2) {
                    System.out.println("Answer must only be 1 or 2");
                }

            } while (processAccount != 1 || processAccount != 2);



            userChoice = scanner.nextInt();


        } while (userChoice != 0);

    }

}
