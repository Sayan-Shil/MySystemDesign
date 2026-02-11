package LLD.DesignPattern.BehavioralDesignPattern.StrategyPattern.InterfaceWay;

public class Card implements PaymentMethod {
    @Override
    public void paymentProcess() {
        // Card Related Work
        System.out.println("Processing Card Payment....");
    }
}
