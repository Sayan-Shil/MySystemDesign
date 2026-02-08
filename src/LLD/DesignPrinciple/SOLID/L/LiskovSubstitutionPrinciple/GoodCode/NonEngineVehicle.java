package LLD.DesignPrinciple.SOLID.L.LiskovSubstitutionPrinciple.GoodCode;

public class NonEngineVehicle extends Vehicle {
    @Override
    public void move() {
        isMovable=true;
        System.out.println("Vehicle has been moved");
    }
}
