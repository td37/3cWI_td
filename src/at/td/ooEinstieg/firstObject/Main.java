package at.td.ooEinstieg.firstObject;

public class Main {
    public static void main(String[] args) {
        /*
        Car c1 = new Car();
        c1.fuelConsumption = 6;
        c1.tankVolume = 60;
        c1.fuelAmount = 14;
        c1.brand = "Ford";
        c1.serialNumber = "F1234";
        c1.color = "türkis";
         */
        Engine e1 = new Engine(50, Engine.TYPE.GAS, 60);
        Engine e2 = new Engine(90, Engine.TYPE.GAS, 23);
        Tank t1 = new Tank(50);

        Car c1 = new Car(e2, t1,5,"mercedes","123");
        System.out.println(c1.getEngine().getSpeed());

        e1.drive();


    }
}
