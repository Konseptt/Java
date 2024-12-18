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
