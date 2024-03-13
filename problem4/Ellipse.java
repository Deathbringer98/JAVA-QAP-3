// Ellipse class extending Shape and implementing Scalable
public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(String name, double majorAxis, double minorAxis) {
        super(name);
        this.majorAxis = Math.max(majorAxis, minorAxis);
        this.minorAxis = Math.min(majorAxis, minorAxis);
    }

    // Override scale method to scale both major and minor axes
    @Override
    public void scale(double factor) {
        majorAxis *= factor;
        minorAxis *= factor;
    }

    // Override methods for computing area and perimeter
    @Override
    public double computeArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public double computePerimeter() {
        return 2 * Math.PI * Math.sqrt((majorAxis * majorAxis + minorAxis * minorAxis) / 2);
    }
}
