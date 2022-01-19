package at.td.ooEinstieg.Calculator;

public class basicCalculator {
    private String color;

    public basicCalculator(String color) {
        this.color = color;
    }

    public void add(){
        System.out.println("Ich kann addieren.");
    }

    public void subtract(){
        System.out.println("Ich kann subtrahieren.");
    }

    public void multiply(){
        System.out.println("Ich kann multiplizieren.");
    }

    public void divide(){
        System.out.println("Ich kann dividieren.");
    }
}
