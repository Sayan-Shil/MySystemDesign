package LLD.DesignPattern.BehavioralDesignPattern.StrategyPattern.InterfaceWay;

public class PaymentProcessor {

    public void processPayment(String paymentMethod){
        switch (paymentMethod.toLowerCase()){
            case "cash":
                //Cash Related Working
                PaymentMethod cashMethod = new Cash();
                cashMethod.paymentProcess();
                break;
            case "upi":
                // UPI Related Work
                PaymentMethod upiMethod = new UPI();
                upiMethod.paymentProcess();
                break;
            case "card":
                // Card Related Work
                PaymentMethod cardMethod = new Card();
                cardMethod.paymentProcess();
                break;
            default:
                System.out.println("Invalid PaymentMethod");

        }
    }
}
