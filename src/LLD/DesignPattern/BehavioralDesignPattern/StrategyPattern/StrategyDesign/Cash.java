package LLD.DesignPattern.BehavioralDesignPattern.StrategyPattern.StrategyDesign;


public class Cash implements PaymentStrategy {

    @Override
    public void processPayment() {
        System.out.println("Processing Cash Payment....");
    }
}
