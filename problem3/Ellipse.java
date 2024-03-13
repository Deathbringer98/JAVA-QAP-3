public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(String name, double majorAxis, double minorAxis) {
        super(name);
        this.majorAxis = Math.max(majorAxis, minorAxis);
        this.minorAxis = Math.min(majorAxis, minorAxis);
    }

    @Override
    public double computeArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public double computePerimeter() {
        return 2 * Math.PI * Math.sqrt((majorAxis * majorAxis + minorAxis * minorAxis) / 2);
    }
}
