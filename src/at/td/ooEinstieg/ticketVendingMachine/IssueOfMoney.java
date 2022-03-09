package at.td.ooEinstieg.ticketVendingMachine;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IssueOfMoney {
    private double change;
    private Controller controller;

    public IssueOfMoney(Controller controller) {
        this.change = change;
        this.controller = controller;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public Controller getController() {
        return controller;
    }
}

