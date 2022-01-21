package at.td.ooEinstieg.calculator;

public class rootCalculator extends basicCalculator{
    public rootCalculator(String color) {
        super(color);
    }

    public void root(double nr) {
        double result = Math.sqrt(nr);
        System.out.println("Die Wurzel aus " + nr + " ist " + result);
    }
}
