public class Car extends Vehicle {

    int engineCapacity;
    double topSpeed;

    public Car() {
        super("Car");
        engineCapacity = 1500;
        topSpeed = 180;
    }

    public double calculateSpeed() {
        return topSpeed;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Engine Capacity: " + engineCapacity + " CC");
        System.out.println("Speed: " + calculateSpeed() + " km/h");
    }
}
