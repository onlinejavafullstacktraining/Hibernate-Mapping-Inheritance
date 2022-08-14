package com.hibernate.many_to_many;

public class Bid {
	private Long id;
	private String bidDescription;
	
	private Item item;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBidDescription() {
		return bidDescription;
	}

	public void setBidDescription(String bidDescription) {
		this.bidDescription = bidDescription;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	

}
