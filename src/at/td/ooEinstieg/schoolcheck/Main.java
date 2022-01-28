package at.td.ooEinstieg.schoolcheck;

public class Main {
    public static void main(String[] args) {

        LightElement le1 = new LightElement("First LightElement", "green", 5, true);
        LightElement le2 = new LightElement("Second LightElement", "blue", 3, false);

        Lamp l1 = new Lamp();

        l1.addLightElement(le1);
        l1.addLightElement(le2);

        l1.getOverallPowerUsage();
        l1.printNamesOfLightElements();
        //l1.turnAllOn();

        le1.turnOn();
        le2.turnOn();

    }
}
