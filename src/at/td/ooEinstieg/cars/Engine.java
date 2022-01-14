package at.td.ooEinstieg.cars;

public class Engine {
    public enum TYPE{DIESEL, BENZIN};

    private TYPE type;
    private int power;

    public Engine(TYPE type, int power) {
        this.type = type;
        this.power = power;
    }

    public TYPE getType() {
        return type;
    }

    public int getPower() {
        return power;
    }
}
