public class Main {
    public static void main(String[] args) {
        BankAccount myBank = new BankAccount();

        myBank.deposit(1000);
        myBank.withdraw(500);

        System.out.println("Current balance: " + myBank.getBalance());
    }
}