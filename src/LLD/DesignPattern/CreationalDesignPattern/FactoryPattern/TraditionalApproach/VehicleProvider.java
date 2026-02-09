package LLD.DesignPattern.CreationalDesignPattern.FactoryPattern.TraditionalApproach;

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
