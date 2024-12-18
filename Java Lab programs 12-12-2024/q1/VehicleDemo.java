

public class VehicleDemo {
    public static void main(String[] args) {
        // Create a Vehicle object
        Vehicle myCar = new Vehicle();

        // Assign values to the data members
        myCar.passengers = 5;
        myCar.fuelCap = 15;
        myCar.mpg = 20;

        // Compute the range of the car
        int range = myCar.range();

        // Display the values and the computed range
        System.out.println("Number of passengers: " + myCar.passengers);
        System.out.println("Fuel capacity: " + myCar.fuelCap + " gallons");
        System.out.println("Fuel consumption: " + myCar.mpg + " miles per gallon");
        System.out.println("The range of the vehicle is: " + range + " miles");
    }
}
