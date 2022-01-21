package at.td.ooEinstieg.geometricFigures;

public class Cube extends Figure{
    private double sideLength;

    public Cube(String name, double sideLength) {
        super(name);
        this.sideLength = sideLength;
    }

    @Override
    public void getArea() {
        double area = this.sideLength * this.sideLength * 6;
        System.out.println("Der Flächeninhalt beträgt: " + area + " cm^2");
    }

    public double getSideLength() {
        return sideLength;
    }
}
