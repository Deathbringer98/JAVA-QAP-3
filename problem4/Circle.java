// Circle class extending Shape and implementing Scalable
public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    // Override scale method to scale the radius
    @Override
    public void scale(double factor) {
        radius *= factor;
    }

    // Override methods for computing area and perimeter
    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }
}
