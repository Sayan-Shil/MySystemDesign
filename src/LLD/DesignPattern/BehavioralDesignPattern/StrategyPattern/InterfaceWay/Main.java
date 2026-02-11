package LLD.DesignPattern.BehavioralDesignPattern.StrategyPattern.InterfaceWay;


import LLD.DesignPattern.BehavioralDesignPattern.StrategyPattern.TraditionalWay.PaymentProcessor;

public class Main {
    static void main() {
        String Cash = "Cash";
        String Card = "Card";
        String UPI = "UPI";

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(Card);
        paymentProcessor.processPayment(UPI);
    }
}
