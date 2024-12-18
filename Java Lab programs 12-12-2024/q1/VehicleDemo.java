/**
 * Java Lab programs 12/12/2024
 * Q1. Create a Vehicle class contains three data members are as follows:
 * a) Number of passengers (passengers)
 * b) Fuel capacity in gallons (fuelCap)
 * c) Fuel consumption in miles per gallon (mpg)
 * Create another class VehicleDemo which is your main class. Now inside VehicleDemo class create an object of Vehicle class and assign values to its instance variables and compute the range will provided by the car.
 */
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle myCar = new Vehicle();
        myCar.passengers = 5;
        myCar.fuelCap = 15;
        myCar.mpg = 20;
        int range = myCar.range();
        System.out.println("Number of passengers: " + myCar.passengers);
        System.out.println("Fuel capacity: " + myCar.fuelCap + " gallons");
        System.out.println("Fuel consumption: " + myCar.mpg + " miles per gallon");
        System.out.println("The range of the vehicle is: " + range + " miles");
    }
}
