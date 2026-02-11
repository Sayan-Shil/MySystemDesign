package LLD.DesignPattern.BehavioralDesignPattern.StrategyPattern.InterfaceWay;

public class Cash implements PaymentMethod {
    @Override
    public void paymentProcess() {
        System.out.println("Processing Cash Payment....");
    }
}
