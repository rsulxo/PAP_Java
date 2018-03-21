
public class ShapeTest {

    public static void main(String[] args) {

        double width = 5;
        double height = 10;

        Shape rect = new Rectangle(width, height);
        System.out.println("Rectangle:");
        System.out.println("\tHeight: "+ height + "\tWidth: " + width);
        System.out.println("\tParameter: " + rect.getPerimeter() + "\tArea: " + rect.getARea());

        double radius = 5;
        Shape circ = new Circle(radius);
        System.out.println("Circle: ");
        System.out.println("\tRadius: " + radius);
        System.out.println("\tArea: " + circ.getARea());
        System.out.println("\tParameter: " + circ.getPerimeter());

        double depth = 15;
        Shape cyli = new Cylinder(depth, radius);
        System.out.println("Cylinder: ");
        System.out.println("\tRadius: " + radius);
        System.out.println("\tDepth: " + depth);
        System.out.println("\tArea: " + cyli.getARea());
        System.out.println("\tParameter: " + cyli.getPerimeter());
        System.out.println("\tVolume: " + cyli.getVolume());
    }
}
