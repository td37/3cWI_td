package at.td.ooEinstieg.Calculator;

public class basicCalculator {
    private String color;

    public basicCalculator(String color) {
        this.color = color;
    }

    public void add(int nr1, int nr2){
        int addedNumbers = nr1 + nr2;
        System.out.println("Die Zahlen " + nr1 + " und " + nr2 + " ergeben addiert " + addedNumbers);
    }

    public void subtract(int nr1, int nr2){
        int subtractedNumbers = nr1 - nr2;
        System.out.println("Die Zahlen " + nr1 + " und " + nr2 + " ergeben subtrahiert " + subtractedNumbers);
    }

    public void multiply(int nr1, int nr2){
        int multipliedNumbers = nr1 * nr2;
        System.out.println("Die Zahlen " + nr1 + " und " + nr2 + " ergeben multipliziert " + multipliedNumbers);
    }

    public void divide(int nr1, int nr2){
        int dividedNumbers = nr1 / nr2;
        System.out.println("Die Zahlen " + nr1 + " und " + nr2 + " ergeben dividiert " + dividedNumbers);
    }
}
