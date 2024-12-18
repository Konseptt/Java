public class VehicleDemo {
    public static void main(String[] args) {
        // Create a Vehicle object using the constructor
        Vehicle myCar = new Vehicle(5, 15, 20);

        // Compute the range of the car
        int range = myCar.range();

        // Display the values and the computed range
        System.out.println("Number of passengers: " + myCar.passengers);
        System.out.println("Fuel capacity: " + myCar.fuelCap + " gallons");
        System.out.println("Fuel consumption: " + myCar.mpg + " miles per gallon");
        System.out.println("The range of the vehicle is: " + range + " miles");
    }
}
