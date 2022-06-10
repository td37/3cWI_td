package at.td.ooEinstieg.schoolcheck2;

public class Coffeemachine {
    boolean turnedOn = false;
    private Controller controller;

    public Coffeemachine(Controller controller) {
        this.controller = controller;
    }

    public void makeCoffee(int size, int strength){
        if(turnedOn==false){
            System.out.println("Bitte schalte die Kaffeemaschine erst ein.");
        }
        else{
            this.controller.makeCoffee(size, strength);
        }
    }

    public void turnOn(){
        this.turnedOn = true;
        System.out.println("Kaffeemaschine wurde eingeschaltet");
    }

    public void turnOff(){
        this.turnedOn = false;
        System.out.println("Kaffeemaschine wurde ausgeschaltet");
    }

    public void fillWater(){
        this.controller.fillWater();
    }

    public void fillBeans(){
        this.controller.fillBeans();
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }
}
