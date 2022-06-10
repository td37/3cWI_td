package at.td.ooEinstieg.schoolcheck2;

public class Controller {
    int size;
    int coffeeStrength;
    int sumUsedWater = 0;
    int sumUsedBeans = 0;
    private Coffeecontainer coffeecontainer;
    private WaterTank waterTank;

    public Controller(Coffeecontainer coffeecontainer, WaterTank waterTank) {
        this.coffeecontainer = coffeecontainer;
        this.waterTank = waterTank;
    }

    public void makeCoffee(int size, int strength){
        if(size < 40 || size > 200){
            System.out.println("Die Kaffeemaschine kann nur Kaffeegrößen zwischen 40ml und 200ml zubereiten.");
        }
        else if(strength < 1 || strength > 10){
            System.out.println("Die Kaffeemaschine kann nur Kaffeestärken von 1-10 herstellen.");
        }
        else {
            if(enoughWater(size)) {
                if (enoughBeans(strength)) {
                    this.sumUsedWater += size;
                    int newWaterLevel = this.waterTank.getWaterLevel() - this.sumUsedWater;
                    System.out.println(newWaterLevel);

                    this.sumUsedBeans += strength;
                    int newCoffeeBeans = this.coffeecontainer.getCoffeeBeans() - this.sumUsedBeans;
                    System.out.println(newCoffeeBeans);
                    System.out.println("Kaffee wird zubereitet");
                } else System.out.println("Bitte Bohnen nachfüllen");
            }
            else {
                System.out.println("Bitte Wasser nachfüllen");
            }
        }
    }

    public boolean enoughWater(int size){
        if(this.waterTank.getWaterLevel()-this.sumUsedWater-size > 0){
            return true;
        }
        else return false;
    }
    public boolean enoughBeans(int strength){
        if(this.coffeecontainer.getCoffeeBeans()-this.sumUsedBeans-strength > 0){
            return true;
        }
        else return false;
    }

    public void fillWater(){
        this.waterTank.fillWater();
        this.sumUsedWater = 0;
    }

    public void fillBeans(){
        this.coffeecontainer.fillBeans();
        this.sumUsedBeans = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCoffeeStrength() {
        return coffeeStrength;
    }

    public void setCoffeeStrength(int coffeeStrength) {
        this.coffeeStrength = coffeeStrength;
    }
}
