// Shape class implementing the Scalable interface
public abstract class Shape implements Scalable {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods for computing area and perimeter
    public abstract double computeArea();

    public abstract double computePerimeter();

    // toString method to print shape details
    @Override
    public String toString() {
        return "Name: " + name + ", Area: " + computeArea() + ", Perimeter: " + computePerimeter();
    }
}
