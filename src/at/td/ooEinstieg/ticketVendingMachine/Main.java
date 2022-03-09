package at.td.ooEinstieg.ticketVendingMachine;

public class Main {
    public static void main(String[] args) {
        Ticket t1 = new Ticket(1);
        Ticket t2 = new Ticket(2);

        Controller controller = new Controller();
        controller.addTicket(t1);
        controller.addTicket(t2);

        IssueOfMoney issueOfMoney = new IssueOfMoney(controller);
        Automaton automaton = new Automaton(controller, issueOfMoney);

        automaton.insertTicket(1);
        //automaton.getPrice();

        automaton.insertMoney();





    }
}
