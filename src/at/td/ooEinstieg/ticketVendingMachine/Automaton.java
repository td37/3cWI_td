package at.td.ooEinstieg.ticketVendingMachine;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Automaton {
    private Controller controller;
    private IssueOfMoney issueOfMoney;
    private boolean inserted = false;
    private int insertedTicket;

    public Automaton(Controller controller, IssueOfMoney issueOfMoney) {
        this.controller = controller;
        this.issueOfMoney = issueOfMoney;
        this.inserted = inserted;
        this.insertedTicket = insertedTicket;
    }

    public void getTicket() {
        int newId = this.controller.getTickets().size() + 1;
        Ticket ticket = new Ticket(newId);
        this.controller.addTicket(ticket);
    }

    public int insertTicket(int ticketId) {
        this.inserted = true;
        this.insertedTicket = ticketId;
        return this.insertedTicket;
    }

    public void getPrice() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (this.isInserted()) {
            Date endDate = new Date();
            this.controller.getTickets().get(this.getInsertedTicket()).setEndTime(endDate.getTime());
            double timeDiffMilli = this.controller.getTickets().get(this.getInsertedTicket()).getEndTime() - this.controller.getTickets().get(this.getInsertedTicket()).getStartTime();
            double timeDiffSec = (timeDiffMilli / 1000);
            double price = timeDiffSec;
            System.out.println("Du musst " + timeDiffSec + "€ bezahlen.");
        } else {
            System.out.println("Es wurde kein Ticket eingelegt.");
        }
    }

    public void insertMoney() {
        try {
            Thread.sleep(11542);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        boolean enoughMoney = true;

        if (this.isInserted()) {
            Date endDate = new Date();
            this.controller.getTickets().get(this.getInsertedTicket()).setEndTime(endDate.getTime());
            double timeDiffMilli = this.controller.getTickets().get(this.getInsertedTicket()).getEndTime() - this.controller.getTickets().get(this.getInsertedTicket()).getStartTime();
            double timeDiffSec = (timeDiffMilli / 1000);
            double price = timeDiffSec;

            System.out.println("Sie müssen " + price + "€ bezahlen. Bitte geben Sie ihr Geld ein.");


            while (enoughMoney) {
                double insertedMoney = scanner.nextDouble();
                double change = insertedMoney - price;
                this.issueOfMoney.setChange(change);

                if (insertedMoney >= price) {
                    System.out.println("Du hast " + insertedMoney + "€ eingegeben. Dein Wechselgeld beträgt " + this.issueOfMoney.getChange() + "€.");
                    this.controller.getTickets().remove(this.insertedTicket);
                    enoughMoney = false;
                } else {
                    double stillNeededMoney = price - insertedMoney;
                    System.out.println("Sie haben zu wenig Geld eingegeben. Bitte bezhalen Sie noch " + stillNeededMoney + "€.");
                }

            }
        } else {
            System.out.println("Es wurde kein Ticket eingelegt.");
        }


    }

    public Controller getController() {
        return controller;
    }

    public IssueOfMoney getIssueOfMoney() {
        return issueOfMoney;
    }

    public boolean isInserted() {
        return inserted;
    }

    public int getInsertedTicket() {
        return insertedTicket;
    }
}
