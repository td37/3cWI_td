package at.td.ooEinstieg.geometricFigures;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle("Kreis", 20);

        System.out.println(c1.getName());
        c1.getArea();

        Rectangle r1 = new Rectangle("Rechteck", 5, 2);
        System.out.println(r1.getName());
        r1.getArea();

        Cube cube1 = new Cube("Würfel", 5);
        System.out.println(cube1.getName());
        cube1.getArea();
    }
}
