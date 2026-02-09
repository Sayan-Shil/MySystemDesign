package LLD.DesignPattern.CreationalDesignPattern.AbstractFactoryPattern.AbstractFactoryDesign;


public class HondaAccord implements Vehicle {
    @Override
    public void start() {
        System.out.println("Honda Accord starting...");
    }

    @Override
    public void stop() {
        System.out.println("Honda Accord stoping...");
    }
}
