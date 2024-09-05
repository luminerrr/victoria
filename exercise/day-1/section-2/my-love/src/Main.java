public class Main {
    public static void main(String[] args) {
        BankAccount myBank = new BankAccount("22334455", "Modric");

        myBank.deposit(10_000);
        myBank.setAccountHolder("Markus Horison");

        myBank.withdraw(2_000);

        System.out.println("This account belongs to: " + myBank.getAccountHolder());
        System.out.println("This account has this much money: " + myBank.getBalance());
    }
}