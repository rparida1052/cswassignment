package assignment1.Q3;

class Point {
    private double x;
    private double y;

    // Parameterized constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point other) {
        this.x = other.getX();
        this.y = other.getY();
    }

    // Getter method for x
    public double getX() {
        return x;
    }

    // Setter method for x
    public void setX(double x) {
        this.x = x;
    }

    // Getter method for y
    public double getY() {
        return y;
    }

    // Setter method for y
    public void setY(double y) {
        this.y = y;
    }
}

public class PointTester {
    public static void main(String[] args) {
        // Create a point object with a parameterized constructor
        Point point1 = new Point(3.5, 4.2);

        // Create a new point object using the copy constructor
        Point point2 = new Point(point1);

        // Display the attributes of point1
        System.out.println("Point 1 - X: " + point1.getX() + ", Y: " + point1.getY());

        // Display the attributes of point2
        System.out.println("Point 2 - X: " + point2.getX() + ", Y: " + point2.getY());

        // Modify the attributes of point1
        point1.setX(5.0);
        point1.setY(7.0);

        // Display the attributes of point1 after modification
        System.out.println("Modified Point 1 - X: " + point1.getX() + ", Y: " + point1.getY());

        // Display the attributes of point2 to ensure it remains unchanged
        System.out.println("Point 2 (unchanged) - X: " + point2.getX() + ", Y: " + point2.getY());
    }
}

