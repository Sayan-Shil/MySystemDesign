package LLD.DesignPattern.BehavioralDesignPattern.StrategyPattern.StrategyDesign;

public class PaymentProcessor {
    PaymentStrategy paymentStrategy;
    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment() {
        paymentStrategy.processPayment();
    }

    public void  setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
