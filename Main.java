public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        Bicycle bicycle = new Bicycle("Mountain Bike", 21, 35);

        System.out.println("Car Details");
        car.displayVehicleDetails();

        System.out.println("Normal Speed: " + car.calculateSpeed() + " km/h");
        System.out.println("Speed with Factor 1.5: "
                + car.calculateSpeed(1.5) + " km/h");

        System.out.println();

        System.out.println("Bicycle Details");
        bicycle.displayVehicleDetails();

        System.out.println("Normal Speed: "
                + bicycle.calculateSpeed() + " km/h");

        System.out.println("Speed with Factor 1.5: "
                + bicycle.calculateSpeed(1.5) + " km/h");
    }
}
