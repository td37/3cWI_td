package at.td.ooEinstieg.bankAccount;

public class CreditAccount extends BaseAccount{
    private double loanInterest = 0.023;
    private double creditLimit = -200;
    private double loanMonths;

    public CreditAccount(double balance, double loanMonths) {
        super(balance);
        this.loanMonths = loanMonths;
    }

    public void creditCosts(){
        double creditCosts = 0;
        if(this.getBalance() <= this.creditLimit){
            System.out.println("Du hast das Kontolimit überschritten.");
        }
        else if(this.getBalance() >= 0){
            System.out.println("Du musst keine Kreditkosten abzahlen.");
        }
        else{
            creditCosts = (-this.getBalance() * this.loanInterest) * this.loanMonths;
            System.out.println("Du musst " + creditCosts + "€ Kreditzinsen zahlen.");
            setBalance(getBalance()-creditCosts);
        }
    }

    public double getLoanInterest() {
        return loanInterest;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getLoanMonths() {
        return loanMonths;
    }
}
