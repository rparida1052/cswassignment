package assignment1.Q1;

// Car class
class Car {
    private String make;
    private String model;

    // Parameterized constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getter and setter methods for make
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // Getter and setter methods for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

// CarTester class
public class CarTester {
    public static void main(String[] args) {
        // Instantiate myCar1 with specified make and model
        Car myCar1 = new Car("Toyota", "Corolla");

        // Instantiate myCar2 with null values
        Car myCar2 = new Car(null, null);

        // Print initial make and model of both cars
        System.out.println("Initial make and model of myCar1: " + myCar1.getMake() + " " + myCar1.getModel());
        System.out.println("Initial make and model of myCar2: " + myCar2.getMake() + " " + myCar2.getModel());

        // Set new values for myCar2 using setter methods
        myCar2.setMake("Honda");
        myCar2.setModel("Civic");

        // Print updated make and model of myCar2
        System.out.println("Updated make and model of myCar2: " + myCar2.getMake() + " " + myCar2.getModel());
    }
}

