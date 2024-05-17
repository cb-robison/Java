/**
 * This is a subclass with parent class Vehicle. This class will set and get the tonnage of a truck
 */

package TestVehicle;

/**
 * Author: Connor Robison
 * Date: 3-13-24
 */

public class Truck extends Vehicle{
    // instance variable
    private int tonnage;
    
    // constructor
    Truck(String make, String model, int year, int tonnage){
        super(make, model, year);
        this.tonnage = tonnage;
    }
    
    // attributes
    void SetTonnage(int tonnage){
        this.tonnage = tonnage;
    }
    
    int GetTonnage(){
        return this.tonnage;
    }
}
