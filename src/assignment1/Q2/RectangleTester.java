package assignment1.Q2;

class Rectangle {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter and setter methods for length
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Getter and setter methods for width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class RectangleTester {
    public static void main(String[] args) {
        // Create an object of Rectangle class
        Rectangle myRectangle = new Rectangle(5.0, 4.0);

        // Display the initial attributes
        System.out.println("Initial Length: " + myRectangle.getLength());
        System.out.println("Initial Width: " + myRectangle.getWidth());

        // Set new values for length and width
        myRectangle.setLength(7.0);
        myRectangle.setWidth(3.0);

        // Display updated attributes
        System.out.println("Updated Length: " + myRectangle.getLength());
        System.out.println("Updated Width: " + myRectangle.getWidth());

        // Calculate and display the area and perimeter
        System.out.println("Area: " + myRectangle.calculateArea());
        System.out.println("Perimeter: " + myRectangle.calculatePerimeter());
    }
}
