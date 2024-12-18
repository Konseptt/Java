
public class Vehicle {
    // Data members
    int passengers;   // Number of passengers
    int fuelCap;      // Fuel capacity in gallons
    int mpg;          // Fuel consumption in miles per gallon

    // Method to compute the range
    int range() {
        return fuelCap * mpg;
    }
}