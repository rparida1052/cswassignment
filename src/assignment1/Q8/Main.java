package assignment1.Q8;
// Vehicle interface
interface Vehicle {
    void accelerate();
    void brake();
}

// Car class implementing the Vehicle interface
class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking");
    }

    // Method overloading for accelerate method
    public void accelerate(int speed) {
        System.out.println("Car is accelerating at " + speed + " km/h");
    }

    // Method overloading for accelerate method with duration
    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating at " + speed + " km/h for " + duration + " seconds");
    }
}

// Bicycle class implementing the Vehicle interface
class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is braking");
    }

    // Method overloading for accelerate method
    public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating at " + speed + " km/h");
    }

    // Method overloading for accelerate method with duration
    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating at " + speed + " km/h for " + duration + " seconds");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Instantiate Car object
        Car car = new Car();
        // Test overridden methods
        car.accelerate();
        car.brake();
        // Test method overloading
        car.accelerate(60);
        car.accelerate(80, 10);

        System.out.println();

        // Instantiate Bicycle object
        Bicycle bicycle = new Bicycle();
        // Test overridden methods
        bicycle.accelerate();
        bicycle.brake();
        // Test method overloading
        bicycle.accelerate(20);
        bicycle.accelerate(30, 5);
    }
}

