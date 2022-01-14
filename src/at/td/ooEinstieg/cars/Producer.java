package at.td.ooEinstieg.cars;

public class Producer {
    private String name;
    private String originatingCountry;
    private double discount;

    public Producer(String name, String originatingCountry, int discount) {
        this.name = name;
        this.originatingCountry = originatingCountry;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public String getOriginatingCountry() {
        return originatingCountry;
    }

    public double getDiscount() {
        return discount;
    }
}
