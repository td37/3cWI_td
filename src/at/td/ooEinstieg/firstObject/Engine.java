package at.td.ooEinstieg.firstObject;

public class Engine {

    public enum TYPE {DIESEL, GAS}

    private int horsePower;
    private TYPE type;
    private int speed;

    public Engine(int horsePower, TYPE type, int speed) {
        this.horsePower = horsePower;
        this.type = type;
        this.speed = speed;
    }


    public void drive() {
        if(this.speed>=1 && this.speed<=100){
            System.out.println("Dieser Motor fährt mit " + this.speed + " km/h");
        }else System.out.println("Man kann nur zwischen 1 und 100 schnell sein.");
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
