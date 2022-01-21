package at.td.ooEinstieg.calculator;

public class Main {
    public static void main(String[] args) {
        basicCalculator bC1 = new basicCalculator("dark blue");
        bC1.add(2, 5);
        bC1.subtract(2, 5);
        bC1.multiply(2, 5);
        bC1.divide(10, 5);

        scientificCalculator sC1 = new scientificCalculator("green");
        sC1.sin(60);
        sC1.cos(40);

        rootCalculator rC1 = new rootCalculator("balck");
        rC1.root(1453);
    }
}
