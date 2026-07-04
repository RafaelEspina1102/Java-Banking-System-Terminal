import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // User Answers
        int userChoice = 0;
        int loginChoice = 0;

        // User account
        String name, username, password;
        User currentUser = null;
        UserManager userManager = new UserManager();

        do {
            // User Login and Account Creation
            try {
                System.out.println("Welcome to the Bank of Rafael");
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
                System.out.println("\nInput must be a number");
                scanner.nextLine();
            }

            if (loginChoice < 1 || loginChoice > 2) {
                System.out.println("Answer must only be 1 or 2");
            }

        } while (currentUser == null);

        do {
            System.out.println("Welcome, "+currentUser.getName());
            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Answer: ");
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    double depositAmount;
                    System.out.print("Deposit Amount: ");
                    depositAmount = scanner.nextDouble();
                    currentUser.deposit(depositAmount);
                    break;
                case 2:
                    double withdrawAmount;
                    System.out.print("Withdraw Amount: ");
                    withdrawAmount = scanner.nextDouble();
                    currentUser.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Your current balance is "+currentUser.getBalance()+"\n");
                    break;
                case 4:
                    System.out.println("Thank you for using bank of Rafal");
            }

        } while (userChoice != 4);


    }

}
