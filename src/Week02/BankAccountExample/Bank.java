package Week02.BankAccountExample;

public class Bank {
    public static void main(String[] args) {
        Account a = new Account("Konstantinos", 1221, 0);
        Account b = new Account("Dimitris", 1222, 0);
        Account c = new Account();

        System.out.println(a);
        a.deposit(10000);
        System.out.println(a);
        a.deposit(374);
        System.out.println(a);
        a.withdraw(927);

        System.out.println("\n");
        System.out.println(b);
        b.withdraw(100);
        System.out.println(b);
        b.withdraw(-50); // Throws error message as the program accepts only >0 numbers.

        System.out.println("\n");
        System.out.println(c);
    }
}