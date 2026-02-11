package LLD.DesignPattern.BehavioralDesignPattern.MediatorPattern.TraditionalWay;

import java.util.List;

public class Bidder {
    String name;
    int bid;
    public Bidder(String name) {
        this.name = name;
    }

    public void placeBid(int amount, List<Bidder> bidders) {
        this.bid = amount;
        System.out.println("Bidder " + name + " placed a bid " + amount);
        for(Bidder bidder : bidders ){
            if(bidder!=this){
                bidder.receiveBid(this,amount);
                // More Notification
                // More Mess

            }
        }

    }

    private void receiveBid(Bidder bidder, int amount) {
        System.out.println(name + "is notified that "+ bidder.name + " has been bid "+amount);
        // More Notification
        // More Mess
    }


}
