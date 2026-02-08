package LLD.DesignPrinciple.SOLID.L.LiskovSubstitutionPrinciple.GoodCode;

public class EngineVehicle extends Vehicle {
    @Override
    public void move() {
        startEngine();
        if(isMovable){
            System.out.println("Vehicle has been moved");
        }
    }

    private void startEngine() {
        System.out.println("Starting Engine");
        isMovable=true;
    }
}
