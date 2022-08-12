package com.hibernate.many_to_one;

import java.util.HashSet;
import java.util.Set;

public class Item {
    private Long id;
    private String itemName;
    private Set<Bid> bidSet=new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Set<Bid> getBidSet() {
        return bidSet;
    }

    public void setBidSet(Set<Bid> bidSet) {
        this.bidSet = bidSet;
    }
    public void addBid(Bid bid){
        bid.setItem(this);
        bidSet.add(bid);
    }
}
