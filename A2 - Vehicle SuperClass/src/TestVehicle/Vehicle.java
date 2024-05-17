/**
 * This is a parent class that will set and get information about a vehicle such as make, model, and year.
 */

package TestVehicle;

/**
 * Author: Connor Robison
 * Date: 3-13-24
 */

public class Vehicle {

    // instace variables
    private String make;
    private String model;
    private int year;

    // constructor
    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // attributes
    String getMake() {
        return make;
    }

    String getModel() {
        return model;
    }

    int getYear() {
        return year;
    }
}
