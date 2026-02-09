package LLD.DesignPattern.CreationalDesignPattern.AbstractFactoryPattern.AbstractFactoryDesign;


public class Main {
    static void main() {
       VehicleProvider hondaProvider = new HondaProvider();
       VehicleProvider toyotaProvider = new ToyotaProvider();

       Vehicle toyota = toyotaProvider.createVehicle("toyota-carolla");
       toyota.start();
       toyota.stop();
    }

}
