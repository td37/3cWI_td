package at.td.ooEinstieg.firstObject;

public class Main {
    public static void main(String[] args) {
        /*
        Car c1 = new Car();
        c1.fuelConsumption = 6;
        c1.tankVolume = 60;
        c1.fuelAmount = 14;
        c1.brand = "Ford";
        c1.serialNumber = "F1234";
        c1.color = "türkis";
         */
        Engine e1 = new Engine(50, Engine.TYPE.GAS, 60);
        Engine e2 = new Engine(90, Engine.TYPE.GAS, 23);
        Tank t1 = new Tank(50);
        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(100, 5);
        Tire tr1 = new Tire(25, 4, Tire.TYPE.WINTERTIRES);
        Tire tr2 = new Tire(25, 4, Tire.TYPE.WINTERTIRES);
        Tire tr3 = new Tire(25, 4, Tire.TYPE.WINTERTIRES);
        Tire tr4 = new Tire(25, 4, Tire.TYPE.WINTERTIRES);


        Car c1 = new Car(e2, t1, 5, "mercedes", "123");
        c1.addMirrors(r1);
        c1.addMirrors(r2);
        c1.addTires(tr1);
        c1.addTires(tr2);
        c1.addTires(tr3);
        c1.addTires(tr4);

        System.out.println(c1.getTires().get(0).getProfileThickness());
        System.out.println(c1.getEngine().getSpeed());

        e1.drive();
        r1.queryPositionOfRearMirror();
    }
}
