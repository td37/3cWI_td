package at.td.ooEinstieg.schoolcheck2;

public class Main {
    public static void main(String[] args) {
        WaterTank waterTank = new WaterTank();
        Coffeecontainer coffeecontainer = new Coffeecontainer();
        Controller controller = new Controller(coffeecontainer, waterTank);
        Coffeemachine coffeemachine = new Coffeemachine(controller);

        coffeemachine.turnOn();
        coffeemachine.makeCoffee(40, 3);
        coffeemachine.makeCoffee(100, 1);
        coffeemachine.fillWater();
        coffeemachine.fillBeans();
        coffeemachine.makeCoffee(100, 1);



    }
}
