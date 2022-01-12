package at.td.ooEinstieg.remote;

public class Main {
    Battery b1 = new Battery(64);
    Battery b2 = new Battery(82);

    Remote r1 = new Remote();

    r1.addBatteries(b1);
    r1.addBatteries(b2);
}
