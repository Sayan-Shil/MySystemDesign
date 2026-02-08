package LLD.DesignPrinciple.SOLID.L.LiskovSubstitutionPrinciple.GoodCode;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new BiCycle();
        Vehicle vehicle2 = new Truck();
        vehicle.move();
        vehicle2.move();

    }
}
