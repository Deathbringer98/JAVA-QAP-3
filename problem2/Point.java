public class Point {
    private float x; // X coordinate
    private float y; // Y coordinate

    // Constructor with parameters x and y
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Default constructor, initializes point to (0,0)
    public Point() {
        this(0.0f, 0.0f);
    }

    // Getter method for x coordinate
    public float getX() {
        return x;
    }

    // Setter method for x coordinate
    public void setX(float x) {
        this.x = x;
    }

    // Getter method for y coordinate
    public float getY() {
        return y;
    }

    // Setter method for y coordinate
    public void setY(float y) {
        this.y = y;
    }

    // Method to set both x and y coordinates at once
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Method to retrieve both x and y coordinates as an array
    public float[] getXY() {
        return new float[]{x, y};
    }

    // Override toString method to represent the Point object as a string
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
