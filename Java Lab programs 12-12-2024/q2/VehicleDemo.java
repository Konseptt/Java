/**
 * Java Lab programs 12/12/2024
 * Q2. Now modify the Vehicle class of Q1. By introducing new methods.
 * a) int range()- compute the range and return it.
 * b) Vehicle()- constructor to initialize the vehicle object.
 */
/**
 * This class demonstrates the usage of the Vehicle class.
 * It creates a Vehicle object, assigns values to its fields, and computes its range.
 */
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle myCar = new Vehicle(5, 15, 20);
        int range = myCar.range();
        System.out.println("Number of passengers: " + myCar.passengers);
        System.out.println("Fuel capacity: " + myCar.fuelCap + " gallons");
        System.out.println("Fuel consumption: " + myCar.mpg + " miles per gallon");
        System.out.println("The range of the vehicle is: " + range + " miles");
    }
}
