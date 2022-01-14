package at.td.ooEinstieg.remote;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private List<Battery> batteries;

    public Remote() {
        this.batteries = new ArrayList<>();
    }

    public void addBatteries(Battery battery) {
        this.batteries.add(battery);
    }

    public void getStatus() {
        int numberOfBatteries = this.batteries.size();
        int sumChargingLevel = 0;
        for (int i = 0; i < numberOfBatteries; i++) {
            sumChargingLevel = sumChargingLevel + this.batteries.get(i).getChargingLevel();
        }
        int averageChargingLevel = sumChargingLevel / numberOfBatteries;
        System.out.println("Die Batterien haben durchschnittlich " + averageChargingLevel + "%");
    }

    public void turnOn() {
        int numberOfBatteries = this.batteries.size();
        for (int i = 0; i < numberOfBatteries; i++) {
            int newChargingLevel = this.batteries.get(i).getChargingLevel() - 5;
            this.batteries.get(i).setChargingLevel(newChargingLevel);
            System.out.println(this.batteries.get(i).getChargingLevel());
            System.out.println("Verbraucher angeschlossen");
        }
    }

    public void turnOff() {
        int numberOfBatteries = this.batteries.size();
        for (int i = 0; i < numberOfBatteries; i++) {
            System.out.println("kein Verbraucher angeschlossen");
        }
    }
}
