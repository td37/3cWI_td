package at.td.ooEinstieg.bankAccount;

public class SavingsAccount extends BaseAccount{

    private double savingYears;
    private double rateOfInterest;

    public SavingsAccount(double balance, double savingYears, double rateOfInterest) {
        super(balance);
        this.savingYears = savingYears;
        this.rateOfInterest = rateOfInterest;
    }

    public void accountInterest(){
        double accountInterest = (this.getBalance() * this.rateOfInterest) * this.savingYears;
        System.out.println("Du hast in den letzten " + this.savingYears + " Jahren " + accountInterest + "€ Zinsen erhalten.");
        setBalance(getBalance()+accountInterest);
    }

    public double getSavingYears() {
        return savingYears;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }
}
