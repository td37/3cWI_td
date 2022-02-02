package at.td.ooEinstieg.bankAccount;

public class CheckingsAccount extends BaseAccount{
    private double membershipYears;
    private double rateOfInterest;

    public CheckingsAccount(double balance, double membershipYears, double rateOfInterest) {
        super(balance);
        this.membershipYears = membershipYears;
        this.rateOfInterest = rateOfInterest;
    }

    public void accountInterest(){
        double accountInterest = (this.getBalance() * this.rateOfInterest) * this.membershipYears;
        System.out.println("Du hast über die letzten " + this.membershipYears + " Jahre " + accountInterest + " Zinsen gezahlt.");
    }
}
