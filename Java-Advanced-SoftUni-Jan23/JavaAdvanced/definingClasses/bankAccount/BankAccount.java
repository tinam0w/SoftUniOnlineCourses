package JavaAdvanced.definingClasses.bankAccount;

public class BankAccount {

    private static final double DEFAULT_INTEREST_RATE = 0.02; //final финална стойност

    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int accountCounts = 0;
    private int id;
    private double balance;

    //конструктор:
    public BankAccount(){
        accountCounts++;
        this.id = accountCounts;
        this.balance = 0;
    }

    //метод
    public static void setInterestRate(double interest) {
        interestRate = interest; //не може да е this защото е static
    }

    public double getInterest(int years) {
        return this.balance * interestRate * years;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public int getId() {
        return this.id;
    }
}
