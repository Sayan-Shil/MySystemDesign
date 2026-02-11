package LLD.DesignPattern.BehavioralDesignPattern.StrategyPattern.StrategyDesign;


public class Main {
    static void main() {
        PaymentStrategy cashMethod = new Cash();
        PaymentStrategy cardMethod = new Card();
        PaymentStrategy upiMethod = new UPI();

        PaymentProcessor  paymentProcessor = new PaymentProcessor(cashMethod);
        paymentProcessor.processPayment();
        paymentProcessor.setPaymentStrategy(upiMethod);
        paymentProcessor.processPayment();

    }
}
