package Week04.BankApp;

import java.util.Scanner;

public class BankMenu {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.loadAccountsFromDB();
        Scanner input = new Scanner(System.in);

        int choice;

        do {
            System.out.print("""
                    1. Add.
                    2. View.
                    3. Set Account to Inactive.
                    4. Set Account to Active.
                    0. Exit.
                    Select:\s""");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: "); // Name input of the customer.
                    String nameInput = input.next();
                    System.out.print("Enter address: "); // Address input of the customer.
                    String addressInput = input.next();
                    System.out.print("Enter phone: "); // Address phone of the customer.
                    String phoneInput = input.next();
                    bank.addAccount(nameInput, addressInput, phoneInput); // Creates an account with the previous defined inputs.
                    break;
                case 2:
                    System.out.print("Enter account ID to view: ");
                    int displayInput = input.nextInt();
                    bank.printAccount(displayInput);
                    break;
                case 3:
                    System.out.print("Enter account ID to deactivate it: ");
                    int inactivityInput = input.nextInt();
                    bank.setToInactive(inactivityInput);
                    break;
                case 4:
                    System.out.print("Enter account ID to activate it: ");
                    int activityInput = input.nextInt();
                    bank.setToActive(activityInput);
                    break;
            }
        } while (choice != 0);
    }
}
