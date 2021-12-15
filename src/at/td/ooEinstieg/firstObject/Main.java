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

        Car c2 = new Car();
        c2.fuelConsumption = 5;
        c2.tankVolume = 50;
        c2.fuelAmount = 23;
        c2.brand = "BMW";
        c2.serialNumber = "B1234";
        c2.color = "blau";

         */

        Car c3 = new Car(4,"Mercedes","M1234");

        System.out.println(c3.getSerialNumber());

        /*
        c1.breaking();

        c1.turboBoost();
        c2.turboBoost();

        c1.honk(3);

        c2.getRemainingRange();

         */
    }
}
