package at.td.ooEinstieg.firstObject;

public class Car {

    private int fuelConsumption;
    private int tankVolume;
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;

    public Car(int fuelConsumption, String brand, String serialNumber) {
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    public void drive() {

        this.fuelConsumption = this.fuelConsumption - this.fuelAmount;
        System.out.println("Ich bin gefahren und verbrauche Treibstoff.");
    }

    public void breaking() {
        System.out.println("Ich bremse.");
    }

    public void turboBoost() {
        double turboBoost = this.tankVolume * 0.1;

        if (this.fuelAmount >= turboBoost) {
            System.out.println("SuperBoostMode");
        } else System.out.println("Not enough fuel to go to Superboost");
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }

    public void getRemainingRange() {
        int remainingRange = this.fuelAmount / this.fuelConsumption;
        System.out.println("Du kannst noch " + remainingRange + " km fahren.");
    }


    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
