package workshop02;

public class FixedDepositAccount extends BankAccount {

    private float interest = 3.0f;
    private int duration = 6;

    public FixedDepositAccount(String name, float initialBalance) {
    super(name, initialBalance);
    }

    public FixedDepositAccount(String name, float initialBalance, float interest) {
        super(name, initialBalance);
        this.interest = interest;
    }

    public FixedDepositAccount(String name, float initialBalance, float interest, int duration) {
        super(name, initialBalance);
        this.interest = interest;
        this.duration = duration;
    }

    public float getBalance() {
        return getAccountBalance() + (interest * duration);
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void deposit(float amount) {
        System.out.println("Deposit not allowed for fixed deposit account.");
    }

    @Override
    public void withdraw(float amount) {
        System.out.println("Withdrawal not allowed for fixed deposit account.");
    }
}
