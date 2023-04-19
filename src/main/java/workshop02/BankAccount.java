package workshop02;

/* To Do: 
 *  - Incorporate account open and close date.
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class BankAccount {
    
    private final String accountName;
    private final String accountNumber;
    private float accountBalance;
    private boolean isClosed;
    private Date creatingDate;
    private Date closingDate;
    private List<String> transactions;
    

    public BankAccount(String name) {
        this.accountName = name;
        this.accountBalance = 0;
        Random rnd = new Random();
        this.accountNumber = Integer.toString(rnd.nextInt(1000000));
        transactions = new ArrayList<String>();
    }

    public BankAccount(String name, float initialBalance) {
        this.accountName = name;
        this.accountBalance = initialBalance;
        Random rnd = new Random();
        this.accountNumber = Integer.toString(rnd.nextInt(1000000));
        transactions = new ArrayList<String>();
    }

    //Can decide whether to generate number for account number or manually key in as String by passing in as parameter.

    public String getAccountName() {
        return accountName;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(float amount) {
        if (isClosed) {
            throw new IllegalArgumentException("Account is closed.");
        }
        else if (amount >= 0) {
            accountBalance += amount;
            Date dt = new Date();
            String message = ("$" + amount + " added to account " + accountNumber + " on " + dt);
            System.out.println(message);
            transactions.add(message);
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public void withdraw(float amount) {
        if (isClosed) {
            throw new IllegalArgumentException("Account is closed.");
        }
        else if (amount >= 0) {
            accountBalance -= amount;
            Date dt = new Date();
            String message = ("$" + amount + " withdrawn from account " + accountNumber + " on " + dt);
            System.out.println(message);
            transactions.add(message);
        }
        else if (amount > accountBalance) {
            throw new IllegalArgumentException("Withdraw amount is more than account balance.");
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public List<String> showTransactions() {
        return transactions;
    }
}