import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // User Answers
        int userChoice = 0;
        int loginChoice = 0;
        boolean authenticated = false;

        // User account
        String name, username, password;
        User currentUser;

        System.out.println("Welcome to the Bank of Rafael");
        UserManager userManager = new UserManager();
        do {
            // User Login and Account Creation
            try {
                System.out.println("1. Login Account\n2. Create Account");
                System.out.print("Answer: ");
                 loginChoice = scanner.nextInt();

                 if (loginChoice == 1) {

                     do {
                         // Login method
                         scanner.nextLine();
                         System.out.print("Username: ");
                         username = scanner.nextLine();

                         System.out.print("Password: ");
                         password = scanner.nextLine();

                         currentUser = userManager.login(username, password); // create checker if no user or wrong user

                     } while (currentUser == null);

                     authenticated = true;

                 } else {
                     // Create account method
                    scanner.nextLine();
                     System.out.println("Account creation");
                     System.out.print("Name: ");
                     name = scanner.nextLine();

                     System.out.print("Username: ");
                     username = scanner.nextLine();

                     System.out.print("Password: ");
                     password = scanner.nextLine();

                     userManager.createAccount(name, username, password);

                 }
            } catch (InputMismatchException e) {
                System.out.println("Input must be a number");
            }

            if (loginChoice < 1 || loginChoice > 2) {
                System.out.println("Answer must only be 1 or 2");
            }

        } while (authenticated == false);



    }

}
