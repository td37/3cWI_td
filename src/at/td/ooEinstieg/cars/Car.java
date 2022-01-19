package at.td.ooEinstieg.cars;

public class Car {
    private Engine engine;
    private Producer producer;
    private String color;
    private int maxSpeed;
    private int basePrice;
    private double baseConsumption;
    private int mileage;

    public Car(Engine engine, Producer producer, String color, int maxSpeed, int basePrice, double baseConsumption, int mileage) {
        this.engine = engine;
        this.producer = producer;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.mileage = mileage;
    }

    public void setBaseConsumption(double baseConsumption) {
        this.baseConsumption = baseConsumption;
    }

    public void discountedPrice(){

        double discountedPrice = this.basePrice - (this.basePrice * (this.producer.getDiscount()/100));
        System.out.println(discountedPrice);
    }

    public void newBaseComsumption(){
        double newBaseConsumption;
        if(this.mileage >= 50000){
            newBaseConsumption = this.baseConsumption + (this.baseConsumption * 0.098);
            setBaseConsumption(newBaseConsumption);
            System.out.println(newBaseConsumption);
        } else System.out.println("Alles oke, dein Auto verbaucht noch den Basisverbrauch");
    }
}
