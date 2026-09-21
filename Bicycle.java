public class Bicycle extends Vehicle {

    int gearCount;
    double maxPedalSpeed;

    public Bicycle(String vehicleName, int gearCount, double maxPedalSpeed) {
        super(vehicleName);
        this.gearCount = gearCount;
        this.maxPedalSpeed = maxPedalSpeed;
    }

    public double calculateSpeed() {
        return maxPedalSpeed;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Gear Count: " + gearCount);
        System.out.println("Speed: " + calculateSpeed() + " km/h");
    }
}
