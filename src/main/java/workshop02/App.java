package workshop02;

public class App {

public static void main(String[] args) {
    
    BankAccount shawn = new BankAccount("Shawn");
    BankAccount sean = new BankAccount("Sean", 2000);
    FixedDepositAccount son = new FixedDepositAccount("son", 200);

    shawn.deposit(300);
    shawn.withdraw(150);
    sean.deposit(345);
    sean.withdraw(567);
    System.out.println(shawn.showTransactions());
    System.out.println(sean.showTransactions());
    System.out.println(son.getBalance());
    }
}