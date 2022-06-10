package at.td.ooEinstieg.schoolcheck2;

public class WaterTank {
    int waterLevel = 1000;

    public WaterTank() {
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void fillWater(){
        waterLevel = 1000;
        System.out.println("Wasser aufgefüllt");
    }

}
