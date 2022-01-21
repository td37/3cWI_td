package at.td.ooEinstieg.calculator;

public class scientificCalculator extends basicCalculator{
    public scientificCalculator(String color) {
        super(color);
    }

    public void sin(double angle){
        double result = Math.sin(angle);
        System.out.println("Sinus von " + angle + " ergibt " + result);
    }

    public void cos(double angle){
        double result = Math.cos(angle);
        System.out.println("Cosinus von " + angle + " ergibt " + result);
    }
}
