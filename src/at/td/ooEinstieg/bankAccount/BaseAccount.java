package at.td.ooEinstieg.bankAccount;

public class BaseAccount {
    private double balance;

    public BaseAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositAmount) {
        this.balance = this.balance + depositAmount;
        System.out.println("Du hast " + depositAmount + "€ eingezahlt, dein neuer Kontostand beträgt " + this.balance + "€");
    }

    public void withdraw(double withdrawAmount) {
        this.balance = this.balance - withdrawAmount;
        System.out.println("Du hast " + withdrawAmount + "€ abgehoben, dein neuer Kontostand beträgt " + this.balance + "€");
    }

    public void showBalance() {
        System.out.println("Dein Kontostand beträgt " + this.balance + "€");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
