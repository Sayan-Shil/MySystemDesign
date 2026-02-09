package LLD.DesignPattern.CreationalDesignPattern.AbstractFactoryPattern.AbstractFactoryDesign;


public class ToyotaProvider implements VehicleProvider{

    @Override
    public Vehicle createVehicle(String vehicleName) {
        return switch (vehicleName.toLowerCase()) {
            case "toyota-carolla" -> new ToyotaCarolla();
            // Add More Tyota Car Brands Here
            default -> throw new IllegalArgumentException("Invalid Vehicle Name for Toyota Provider");
        };
    }
}
