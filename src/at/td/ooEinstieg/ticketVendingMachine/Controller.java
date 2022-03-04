package at.td.ooEinstieg.ticketVendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private double price;
    private List<Ticket> tickets;

    public Controller() {
        this.price = price;
        this.tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket){
        this.tickets.add(ticket);
    }

    public double getPrice() {
        return price;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }
}
