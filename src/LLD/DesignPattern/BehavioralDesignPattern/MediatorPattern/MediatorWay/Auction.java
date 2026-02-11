package LLD.DesignPattern.BehavioralDesignPattern.MediatorPattern.MediatorWay;

public class Auction {
    static void main() {
        AuctionMediator auctionMediator = new AuctionHouse();
        Bidder bidder = new Bidder("ABC",auctionMediator);
        Bidder bidder2 = new Bidder("DEF",auctionMediator);
        Bidder bidder3 = new Bidder("GHI",auctionMediator);

        // Action Start
        bidder.placeBid(1000);
    }
}
