package at.td.OOEinstieg.FirstObject;

public class Car {

    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    public String color;

    public void drive() {

        this.fuelConsumption = this.fuelConsumption - this.fuelAmount;
        System.out.println("Ich bin gefahren und verbrauche Treibstoff.");
    }
}
