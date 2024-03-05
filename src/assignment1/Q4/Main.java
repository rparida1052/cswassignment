package assignment1.Q4;

class Laptop {
    private String model;
    private double price;

    // Constructor
    public Laptop(String model, double price) {
        this.model = model;
        this.price = price;
    }

    // Setter method for model
    public void setModel(String model) {
        this.model = model;
    }

    // Setter method for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Overriding toString() method to return model and price
    @Override
    public String toString() {
        return "Laptop Model: " + model + ", Price: $" + price;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Laptop
        Laptop myLaptop = new Laptop("Dell XPS 13", 1200.0);

        // Set model using setter method
        myLaptop.setModel("MacBook Pro");

        // Print the laptop object using toString() method
        System.out.println(myLaptop.toString());
    }
}

