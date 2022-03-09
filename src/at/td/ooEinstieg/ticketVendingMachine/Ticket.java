package at.td.ooEinstieg.ticketVendingMachine;

import java.util.Date;

public class Ticket {
    private int id;
    private long startTime;
    private long endTime;
    Date createDate = new Date();

    public Ticket(int id) {
        this.id = id;
        this.startTime = createDate.getTime();
        this.endTime = endTime;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
}

