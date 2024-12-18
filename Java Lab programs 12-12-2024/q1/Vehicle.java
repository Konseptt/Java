/**
 * Java Lab programs 12/12/2024
 * Q1. Create a Vehicle class contains three data members are as follows:
 * a) Number of passengers (passengers)
 * b) Fuel capacity in gallons (fuelCap)
 * c) Fuel consumption in miles per gallon (mpg)
 * Create another class VehicleDemo which is your main class. Now inside VehicleDemo class create an object of Vehicle class and assign values to its instance variables and compute the range will provided by the car.
 */
public class Vehicle {
    int passengers;
    int fuelCap;
    int mpg;

    int range() {
        return fuelCap * mpg;
    }
}