public class MovablePoint extends Point {
    private float xSpeed; // Speed in the x direction
    private float ySpeed; // Speed in the y direction

    // Constructor with parameters x, y, xSpeed, and ySpeed
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Constructor with parameters xSpeed and ySpeed, initializes point to (0,0)
    public MovablePoint(float xSpeed, float ySpeed) {
        this(0.0f, 0.0f, xSpeed, ySpeed);
    }

    // Default constructor, initializes point to (0,0) and speeds to 0
    public MovablePoint() {
        this(0.0f, 0.0f);
    }

    // Getter method for xSpeed
    public float getXSpeed() {
        return xSpeed;
    }

    // Setter method for xSpeed
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    // Getter method for ySpeed
    public float getYSpeed() {
        return ySpeed;
    }

    // Setter method for ySpeed
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Method to set both xSpeed and ySpeed at once
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Method to retrieve both xSpeed and ySpeed as an array
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // Override toString method to represent the MovablePoint object as a string
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + "," + ySpeed + ")";
    }

    // Method to move the point by adding xSpeed and ySpeed to its coordinates
public MovablePoint move() {
    setX(getX() + xSpeed);
    setY(getY() + ySpeed);
    return this;
}

}
