package LLD.DesignPattern.CreationalDesignPattern.AbstractFactoryPattern.AbstractFactoryDesign;


public class ToyotaCarolla implements Vehicle {
    @Override
    public void start() {
        System.out.println("Toyota Carolla starting ..");
    }

    @Override
    public void stop() {
        System.out.println("Toyota Carolla stopping ..");
    }
}
