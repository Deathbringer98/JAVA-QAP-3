// Demo class with a static method to scale shapes
public class Demo {
    public static void main(String[] args) {
        // Creating shapes
        Shape[] shapes = {
            new Circle("Circle", 5),
            new Ellipse("Ellipse", 4, 2),
            new Triangle("Triangle", 3, 4, 5),
            new EquilateralTriangle("Equilateral Triangle", 4)
        };

        // Printing shapes before scaling
        System.out.println("Before scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        // Scaling shapes
        scaleShapes(shapes, 2);

        // Printing shapes after scaling
        System.out.println("\nAfter scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    // Static method to scale shapes
    public static void scaleShapes(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }
}
