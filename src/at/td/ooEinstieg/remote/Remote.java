package at.td.ooEinstieg.remote;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private List<Battery> batteries;

    public Remote(Battery battery){
        this.batteries = new ArrayList<>();
    }

    public void addBatteries(Battery battery) {
        this.batteries.add(battery);
    }

    public void getStatus(){

    }
}
