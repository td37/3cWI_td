package at.td.ooEinstieg.cars;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(Engine.TYPE.DIESEL, 110);
        Engine e2 = new Engine(Engine.TYPE.BENZIN, 120);

        Producer p1 = new Producer("Opel", "Deutschland", 10);
        Producer p2 = new Producer("BMW", "Frankreich", 12);

        Car c1 = new Car(e1,p1, "blue", 220, 34000, 5, 20000);
        Car c2 = new Car(e2, p2, "black", 200, 23000, 4, 65000);

        c1.discountedPrice();
        c1.newBaseComsumption();
        c2.newBaseComsumption();
    }
}
