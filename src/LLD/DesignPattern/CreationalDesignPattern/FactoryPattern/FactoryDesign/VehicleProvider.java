package LLD.DesignPattern.CreationalDesignPattern.FactoryPattern.FactoryDesign;

import LLD.DesignPattern.CreationalDesignPattern.FactoryPattern.TraditionalApproach.Bike;
import LLD.DesignPattern.CreationalDesignPattern.FactoryPattern.TraditionalApproach.Car;
import LLD.DesignPattern.CreationalDesignPattern.FactoryPattern.TraditionalApproach.Truck;
import LLD.DesignPattern.CreationalDesignPattern.FactoryPattern.TraditionalApproach.Vehicle;

public class VehicleProvider {
    public static Vehicle getVehicle(String vehicleName) {

        return switch (vehicleName.toLowerCase()) {
            case "car" -> new Car();
            case "bike" -> new Bike();
            case "truck" -> new Truck();
            default -> throw new IllegalArgumentException("Invalid Vehicle Name");
        };
    }
}
