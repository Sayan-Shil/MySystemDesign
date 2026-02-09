package LLD.DesignPattern.CreationalDesignPattern.FactoryPattern.TraditionalApproach;

public class Main {
    static void main() {
        Vehicle vehicle = VehicleProvider.getVehicle("Car");
        Vehicle vehicle2 = VehicleProvider.getVehicle("Truck");

        vehicle.start();
        vehicle.stop();
        vehicle2.start();
        vehicle2.stop();
    }
}
