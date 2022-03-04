package at.td.ooEinstieg.ticketVendingMachine;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    public int insertTicket(int ticketId){
        this.inserted = true;
        this.insertedTicket = ticketId;
        return this.insertedTicket;
    }

    public void getPrice() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(this.isInserted()) {
            Date endDate = new Date();
            this.controller.getTickets().get(this.getInsertedTicket()).setEndTime(endDate.getTime());
            long timeDiffMilli = this.controller.getTickets().get(this.getInsertedTicket()).getEndTime() - this.controller.getTickets().get(this.getInsertedTicket()).getStartTime();
            long timeDiffMin  = (timeDiffMilli / 1000)%60;
            System.out.println(timeDiffMin);
        }
        else {
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
