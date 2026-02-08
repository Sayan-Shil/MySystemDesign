package LLD.DesignPrinciple.SOLID.L.LiskovSubstitutionPrinciple.BadCode;

public class BiCycle extends Vehicle {
    public boolean isMovable = true;

    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("Cycle Do not have engine");
    }
}
