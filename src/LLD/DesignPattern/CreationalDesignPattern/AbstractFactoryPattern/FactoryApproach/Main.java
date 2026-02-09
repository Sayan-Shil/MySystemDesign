package LLD.DesignPattern.CreationalDesignPattern.AbstractFactoryPattern.FactoryApproach;

public class Main {
    static void main() {
        Vehicle vehicle= VehicleProvider.createVehicle("toyota-carolla");
        Vehicle vehicle2 = VehicleProvider.createVehicle("honda-civic");
        vehicle.start();
        vehicle.stop();
        vehicle2.start();
        vehicle2.stop();
    }
}
