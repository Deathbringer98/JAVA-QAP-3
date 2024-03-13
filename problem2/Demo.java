public class Demo {
    public static void main(String[] args) {
        // Creating a Point object and printing its coordinates
        Point point = new Point(3.0f, 4.0f);
        System.out.println("Point: " + point);

        // Creating a MovablePoint object with speed and printing its coordinates and speed
        MovablePoint movablePoint = new MovablePoint(1.0f, 1.0f, 2.0f, 3.0f);
        System.out.println("MovablePoint: " + movablePoint);

        // Moving the MovablePoint and printing its new coordinates
        movablePoint.move();
        System.out.println("MovablePoint after moving: " + movablePoint);
    }
}
