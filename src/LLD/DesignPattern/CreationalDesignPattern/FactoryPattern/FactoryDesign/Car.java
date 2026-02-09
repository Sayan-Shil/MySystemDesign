package LLD.DesignPattern.CreationalDesignPattern.FactoryPattern.FactoryDesign;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car start");
    }

    @Override
    public void stop() {
        System.out.println("Car stop");
    }
}
