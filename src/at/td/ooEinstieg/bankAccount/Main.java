package at.td.ooEinstieg.bankAccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa1 = new SavingsAccount(651, 4, 0.24);
        sa1.accountInterest();
        sa1.deposit(230);
        sa1.withdraw(20);
        sa1.showBalance();

        CheckingsAccount ca1 = new CheckingsAccount(542, 3, 0.12);
        ca1.accountInterest();

        LaendleAccount la1 = new LaendleAccount(210, 4);
        la1.accountKeepingCosts();

        CreditAccount cra1 = new CreditAccount(-10, 5);
        CreditAccount cra2 = new CreditAccount(10, 5);

        cra1.creditCosts();
        cra2.creditCosts();
    }
}
