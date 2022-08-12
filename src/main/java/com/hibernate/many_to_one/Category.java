package com.hibernate.many_to_one;

import java.util.HashSet;
import java.util.Set;

public class Category {
    private Long id;
    private String categoryName;
    private Category parentCategory;
    private Set<Category> childCategories=new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public Set<Category> getChildCategories() {
        return childCategories;
    }

    public void setChildCategories(Set<Category> childCategories) {
        this.childCategories = childCategories;
    }
    public void addChildCategory(Category childCategory) {
        if(childCategory==null)
            throw new IllegalArgumentException("Null child category");
        if(childCategory.getParentCategory()!=null)
            childCategory.getParentCategory().getChildCategories().remove(childCategory);
        childCategory.setParentCategory(this);
        childCategories.add(childCategory);
    }
}
