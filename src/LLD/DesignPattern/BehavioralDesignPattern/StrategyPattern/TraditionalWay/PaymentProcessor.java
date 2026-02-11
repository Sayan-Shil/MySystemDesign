package LLD.DesignPattern.BehavioralDesignPattern.StrategyPattern.TraditionalWay;

public class PaymentProcessor {
    public void processPayment(String paymentMethod){
        switch (paymentMethod.toLowerCase()){
            case "cash":
                //Cash Related Working
                System.out.println("Processing Cash Payment....");
                break;
            case "upi":
                // UPI Related Work
                System.out.println("Processing UPI Payment....");
                break;
            case "card":
                // Card Related Work
                System.out.println("Processing Card Payment....");
                break;
            default:
                System.out.println("Invalid PaymentMethod");

        }
    }
}
