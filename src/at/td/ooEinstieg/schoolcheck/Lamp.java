package at.td.ooEinstieg.schoolcheck;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lamp {
    private List<LightElement> lightElements;

    public Lamp() {
        this.lightElements = new ArrayList<>();
    }

    public void addLightElement(LightElement lightElement) {
        this.lightElements.add(lightElement);
    }

    public void turnAllOn() {
        int numberOfLightElements = this.lightElements.size();
        for (int i = 0; i < numberOfLightElements; i++) {
            this.lightElements.get(i).setStatus(true);
        }
        System.out.println("Alle Glühelemente sind nun eingeschaltet.");
    }

    public void getOverallPowerUsage() {
        double sumPowerConsumption = 0;
        int numberOfLightElements = this.lightElements.size();
        for (int i = 0; i < numberOfLightElements; i++) {
            sumPowerConsumption = sumPowerConsumption + this.lightElements.get(i).getPowerConsumption();
        }
        System.out.println("Alle Glühelemente zusammen haben " + sumPowerConsumption + " Strom verbraucht.");
    }

    public void printNamesOfLightElements() {
        int numberOfLightElements = this.lightElements.size();
        for (int i = 0; i < numberOfLightElements; i++) {
            System.out.println(this.lightElements.get(i).getName());
        }
    }
}
