package at.td.ooEinstieg.schoolcheck;

public class LightElement {
    private String name;
    private String colour;
    private double powerConsumption;
    private boolean status;

    public LightElement(String name, String colour, double powerConsumption, boolean status) {
        this.name = name;
        this.colour = colour;
        this.powerConsumption = powerConsumption;
        this.status = status;
    }

    public void turnOn() {
        double newPowerConsumption;
        if (this.status) {
            System.out.println("Mein Name ist " + this.name + ". Ich bin bereits eingeschaltet.");
        }else {
            newPowerConsumption = this.powerConsumption + 5;
            setPowerConsumption(newPowerConsumption);
            System.out.println("Der neue Stromverbrauch beträgt nun " + this.powerConsumption);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
