package at.td.ooEinstieg.Calculator;

public class Main {
    public static void main(String[] args) {
        basicCalculator bC1 = new basicCalculator("dark blue");

        bC1.add(2, 5);
        bC1.subtract(2, 5);
        bC1.multiply(2, 5);
        bC1.divide(10, 5);
    }
}
