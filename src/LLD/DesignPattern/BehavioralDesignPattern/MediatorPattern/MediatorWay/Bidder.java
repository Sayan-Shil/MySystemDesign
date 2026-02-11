package LLD.DesignPattern.BehavioralDesignPattern.MediatorPattern.MediatorWay;

import java.util.List;

public class Bidder {
    String name;
    int bid;
    private AuctionMediator mediator;
    public Bidder(String name, AuctionMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.registerBidder(this);
    }

    public void placeBid(int amount) {
        this.bid = amount;
        System.out.println("Bidder " + name + " placed a bid " + amount);
        mediator.placeBid(this,amount);

    }

    public void receiveBid(Bidder bidder, int amount) {
        System.out.println(name + "is notified that "+ bidder.name + " has been bid "+amount);
        // More Notification
        // More Mess
    }


}
