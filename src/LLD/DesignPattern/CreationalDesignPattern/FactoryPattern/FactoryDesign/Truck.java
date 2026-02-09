package LLD.DesignPattern.CreationalDesignPattern.FactoryPattern.FactoryDesign;

public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck start");
    }

    @Override
    public void stop() {
        System.out.println("Truck stop");
    }
}
