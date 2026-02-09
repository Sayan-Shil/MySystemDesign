package LLD.DesignPattern.CreationalDesignPattern.FactoryPattern.FactoryDesign;

import LLD.DesignPattern.CreationalDesignPattern.FactoryPattern.TraditionalApproach.Vehicle;

public class Main {
    static void main() {
        LLD.DesignPattern.CreationalDesignPattern.FactoryPattern.TraditionalApproach.Vehicle vehicle = VehicleProvider.getVehicle("Car");
        Vehicle vehicle2 = VehicleProvider.getVehicle("Truck");

        vehicle.start();
        vehicle.stop();
        vehicle2.start();
        vehicle2.stop();
    }
}
