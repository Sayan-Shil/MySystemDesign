package LLD.DesignPattern.CreationalDesignPattern.AbstractFactoryPattern.FactoryApproach;



public class VehicleProvider {
    public static Vehicle createVehicle(String vehicleName) {

        return switch (vehicleName.toLowerCase()) {
            case "honda-civic" -> new HondaCivic();
            case "honda-accord" -> new HondaAccord();
            case "toyota-carolla" -> new ToyotaCarolla();
            default -> throw new IllegalArgumentException("Invalid Vehicle Name");
        };
    }
}
