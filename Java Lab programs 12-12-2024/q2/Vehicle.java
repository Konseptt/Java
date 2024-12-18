/**
 * This class represents a Vehicle with passengers, fuel capacity, and miles per gallon fields.
 * It includes a method to compute the range of the Vehicle.
 * 
 * Java Lab programs 12/12/2024
 * Q2. Now modify the Vehicle class of Q1. By introducing new methods.
 * a) int range()- compute the range and return it.
 * b) Vehicle()- constructor to initialize the vehicle object.
 */
public class Vehicle {
    int passengers;
    int fuelCap;
    int mpg;

    public Vehicle(int passengers, int fuelCap, int mpg) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    }

    int range() {
        return fuelCap * mpg;
    }
}
