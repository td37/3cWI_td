package at.td.ooEinstieg.bankAccount;

public class LaendleAccount extends BaseAccount {
    private double membershipYears;
    private double accountManagement = 83.04;

    public LaendleAccount(double balance, double membershipYears) {
        super(balance);
        this.membershipYears = membershipYears;
    }

    public void accountKeepingCosts(){
        double accountKeepingCosts = 0;
        for (int i = 0; i < getMembershipYears(); i++) {
            accountKeepingCosts = accountKeepingCosts + this.accountManagement;
        }
        System.out.println("Dein Ländlegirokonto kostete dich seit deiner Kontoeröffnung " + accountKeepingCosts + "€");
        setBalance(getBalance()-accountKeepingCosts);
    }

    public double getMembershipYears() {
        return membershipYears;
    }

    public double getAccountManagement() {
        return accountManagement;
    }
}