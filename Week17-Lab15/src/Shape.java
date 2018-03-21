
// Main shape interface for all the shapes
public interface Shape {
    // Declaring possible methods for different shapes
    double getPerimeter();
    double getARea();
    double getVolume();
}
// Setting the 2D interface that extend the shape
interface TwoDShape extends Shape{
    //uses the methods in 2D shapes
    double getPerimeter();
    double getARea();
}

interface ThreeDShape extends TwoDShape{
    double getVolume();
}

class Circle implements TwoDShape{

    double radius;
    final double pi = Math.PI;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * pi * radius;
    }

    public double getARea() {
        return pi * (radius*radius);
    }


    public double getVolume() {
        return 0;
    }

}

class Rectangle implements TwoDShape {

    double width, height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getPerimeter() {
        return (width+height)*2;
    }
    public double getARea() {
        return width*height;
    }
    public double getVolume() {
        return 0;
    }
}

class Cylinder implements ThreeDShape{

    double depth, radius;
    final double pi = Math.PI;

    public Cylinder() {}

    public Cylinder(double depth, double radius) {
        this.depth = depth;
        this.radius = radius;
    }

    public double getVolume() {
        return (pi * (radius*radius))*depth;
    }

    public double getPerimeter() {
        double D = radius *2;
        return 2*( pi* D + depth);
    }

    public double getARea() {

        return (2*pi*radius*depth + 2 * pi * (radius * radius));

    }
}