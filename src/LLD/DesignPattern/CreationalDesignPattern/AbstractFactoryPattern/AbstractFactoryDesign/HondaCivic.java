package LLD.DesignPattern.CreationalDesignPattern.AbstractFactoryPattern.AbstractFactoryDesign;


public class HondaCivic implements Vehicle {
    @Override
    public void start() {
        System.out.println("Honda Civic starting ....");
    }

    @Override
    public void stop() {
        System.out.println("Honda Civic stopping...");
    }
}
