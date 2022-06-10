package at.td.ooEinstieg.schoolcheck2;

public class Coffeecontainer {
    int coffeeBeans = 500;

    public Coffeecontainer() {
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void fillBeans(){
        coffeeBeans = 500;
        System.out.println("Bohnen aufgefüllt");
    }
}
