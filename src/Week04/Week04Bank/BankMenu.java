package Week04.Week04Bank;

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
                    break;
                case 2:
                    System.out.print("Enter account ID: ");
                    int displayInput = input.nextInt();
                    bank.printAccount(displayInput);
                    break;
                case 3:
                    System.out.print("Enter account ID: ");
                    int inactivityInput = input.nextInt();
                    bank.setToInactive(inactivityInput);
                    break;
                case 4:
                    System.out.print("Enter account ID: ");
                    int activityInput = input.nextInt();
                    bank.setToActive(activityInput);
                    break;
            }
        } while (choice != 0);
    }
}
