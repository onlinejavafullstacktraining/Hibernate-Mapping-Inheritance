package com.hibernate.many_to_many;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String description;
	
	private Set<Bid> bidSet=new HashSet<>();
	
	private Set<Category> categories=new HashSet<>();
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	private void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	
	
	public Set<Bid> getBidSet() {
		return bidSet;
	}



	public void setBidSet(Set<Bid> bidSet) {
		this.bidSet = bidSet;
	}



	public void addCategory(Category category) {
		if(category==null)
			throw new IllegalArgumentException("NUll Category Object");
		category.getItems().add(this);
		categories.add(category);
	}
	
	

}
