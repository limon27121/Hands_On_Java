
// Parent class
class Car {
    String brand;
    int year;

    // Constructor
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method in the parent class
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Child class
class Toyota extends Car {
    int warranty;

    // Constructor
    public Toyota(String brand, int year, int warranty) {
        super(brand, year); // Calling the constructor of the parent class
        this.warranty = warranty;
    }

    // Method specific to Toyota
    public void displayToyotaInfo() {
        // Using the displayInfo method from the parent class
        super.displayInfo();

        System.out.println("Warranty: " + warranty + " years");
    }
}

public class Inheritance_exm1 {
    public static void main(String[] args) {
        // Creating an object of the child class
        Toyota toyotaCar = new Toyota("Toyota", 2022, 3);

        // Accessing the method in the child class
        toyotaCar.displayToyotaInfo();
    }
}

