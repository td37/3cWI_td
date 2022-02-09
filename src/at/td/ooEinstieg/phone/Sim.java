package at.td.ooEinstieg.phone;

public class Sim {
    private int id;
    private String number;

    public Sim(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public void doCall(String number){
        System.out.println("Calling " + number);
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }
}
