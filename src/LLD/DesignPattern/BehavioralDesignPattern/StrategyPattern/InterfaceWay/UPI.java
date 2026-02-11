package LLD.DesignPattern.BehavioralDesignPattern.StrategyPattern.InterfaceWay;

public class UPI implements PaymentMethod {

    @Override
    public void paymentProcess() {
        System.out.println("Processing UPI Payment....");
    }
}
