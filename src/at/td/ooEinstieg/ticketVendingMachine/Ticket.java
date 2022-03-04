package at.td.ooEinstieg.ticketVendingMachine;

import java.util.Date;

public class Ticket {
    private int id;
    private Date startTime;
    private Date endTime;

    public Ticket(int id) {
        this.id = id;
        this.startTime = new Date();
        this.endTime = new Date();
    }

    public int getId() {
        return id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }
}
