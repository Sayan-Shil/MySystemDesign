package LLD.DesignPrinciple.SOLID.L.LiskovSubstitutionPrinciple.BadCode;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new BiCycle();

        try{
            vehicle.startEngine();
        } catch (UnsupportedOperationException e) {
            System.out.println("Vehicle has no engine, Vehicle Started");
        }

    }
}
