package LLD.DesignPattern.BehavioralDesignPattern.StrategyPattern.StrategyDesign;

public class Card implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing Card Payment....");
    }
}
