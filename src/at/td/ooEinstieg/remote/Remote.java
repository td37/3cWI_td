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
        int averageChargingLevel = (this.batteries.get(0) + this.batteries.get(1)) / 2;
    }
}
