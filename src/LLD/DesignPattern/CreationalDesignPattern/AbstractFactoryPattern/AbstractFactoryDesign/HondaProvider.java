package LLD.DesignPattern.CreationalDesignPattern.AbstractFactoryPattern.AbstractFactoryDesign;


public class HondaProvider implements VehicleProvider {
    @Override
    public Vehicle createVehicle(String vehicleName) {
        return switch (vehicleName.toLowerCase()) {
            case "honda-civic" -> new HondaCivic();
            case "honda-accord" -> new HondaAccord();
            default -> throw new IllegalArgumentException("Invalid Vehicle Name For Honda Provider");
        };
    }
}
