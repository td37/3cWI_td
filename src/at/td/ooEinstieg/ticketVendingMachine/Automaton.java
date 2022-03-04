package at.td.ooEinstieg.ticketVendingMachine;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Automaton {
    private Controller controller;
    private boolean inserted = false;

    public Automaton(Controller controller) {
        this.controller = controller;
        this.inserted = inserted;
    }

    public void getTicket() {
        int newId = this.controller.getTickets().size() + 1;
        Ticket ticket = new Ticket(newId);
        this.controller.addTicket(ticket);
    }

    public int insertTicket(int ticketId){
        this.inserted = true;
        int insertedTicket = ticketId;
    }

    public Controller getController() {
        return controller;
    }

    public boolean isInserted() {
        return inserted;
    }
}
