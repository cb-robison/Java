/**
 * This program will test the Truck class which is an extension of the parent class Vehicle
 */

package TestVehicle;

/**
 * Author: Connor Robison
 * Date: 3-13-24
 */

public class TestTruck {
    
    public static void main(String[] args) {
        
// create objects
        Truck t1 = new Truck("Ford", "F150", 2005, 1000);
        Truck t2 = new Truck("Chevrolet", "Silverado", 2023, 1500 );
        Truck t3 = new Truck("Tesla", "Cybertruck", 2024, 2500 );
        
        // display results
        PrintTruck(t1);
        PrintTruck(t2);
        PrintTruck(t3);
        
    }

    // utility function
    private static void PrintTruck(Truck truck) {
        System.out.printf("%s %s:\n\tYear: %d\n\tTonnage: %d\n", truck.getMake(),
                truck.getModel(), truck.getYear(), truck.GetTonnage());
    }
    
}
