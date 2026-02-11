package LLD.DesignPattern.BehavioralDesignPattern.MediatorPattern.TraditionalWay;

import java.util.List;

public class Auction {
    static void main() {
        Bidder bidder = new Bidder("ABC");
        Bidder bidder2 = new Bidder("DEF");
        Bidder bidder3 = new Bidder("GHI");
        Bidder bidder4 = new Bidder("JKL");
        Bidder bidder5 = new Bidder("MNO");

        List<Bidder> bidders = List.of(bidder, bidder2, bidder3, bidder4, bidder5);

        // Bidding Starts
        bidder3.placeBid(40000, bidders);
    }
}
