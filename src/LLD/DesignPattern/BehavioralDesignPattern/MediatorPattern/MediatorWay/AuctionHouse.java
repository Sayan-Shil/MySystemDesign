package LLD.DesignPattern.BehavioralDesignPattern.MediatorPattern.MediatorWay;

import java.util.ArrayList;
import java.util.List;

public class AuctionHouse implements AuctionMediator  {

    private List<Bidder> bidders = new ArrayList<Bidder>();


    @Override
    public void registerBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(Bidder bidder, int amount) {
        for(Bidder bidderFromList : bidders ){
            if(!bidder.equals(bidderFromList)){
                bidderFromList.receiveBid(bidder,amount);
            }
        }
    }
}
