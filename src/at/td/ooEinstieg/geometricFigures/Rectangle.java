package at.td.ooEinstieg.geometricFigures;

public class Rectangle extends Figure{
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public void getArea() {
        double area = this.length * this.width;
        System.out.println("Der Flächeninhalt beträgt: " + area + " cm^2");
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
