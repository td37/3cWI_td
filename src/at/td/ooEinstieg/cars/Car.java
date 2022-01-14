package at.td.ooEinstieg.cars;

public class Car {
    private Engine engine;
    private Producer producer;
    private String color;
    private int maxSpeed;
    private int basePrice;
    private int baseConsumption;

    public Car(Engine engine, Producer producer, String color, int maxSpeed, int basePrice, int baseConsumption) {
        this.engine = engine;
        this.producer = producer;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
    }

    public void discountedPrice(){

        double discountedPrice = this.basePrice - (this.basePrice * (this.producer.getDiscount()/100));
        System.out.println(discountedPrice);
    }
}
