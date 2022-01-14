package at.td.ooEinstieg.remote;

public class Battery {
    private int chargingLevel;

    public Battery(int chargingLevel) {
        this.chargingLevel = chargingLevel;
    }

    public int getChargingLevel() {
        return chargingLevel;
    }

    public void setChargingLevel(int chargingLevel) {
        this.chargingLevel = chargingLevel;
    }
}
