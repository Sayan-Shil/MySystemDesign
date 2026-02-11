package LLD.DesignPattern.BehavioralDesignPattern.MediatorPattern.MediatorWay;

public interface AuctionMediator {
    void registerBidder(Bidder bidder);
    void placeBid(Bidder bidder, int amount);
}
