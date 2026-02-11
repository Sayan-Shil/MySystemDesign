package LLD.DesignPattern.BehavioralDesignPattern.StrategyPattern.StrategyDesign;


public class UPI implements PaymentStrategy {

    @Override
    public void processPayment() {
        System.out.println("Processing UPI Payment....");
    }
}
