package LLD.DesignPrinciple.SOLID.L.LiskovSubstitutionPrinciple.BadCode;

public class Truck extends Vehicle{
    @Override
    public void startEngine() {
        isMovable = true;
        System.out.println("Truck has started");
    }
}
