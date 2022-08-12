package com.hibernate.Table_per_concrete;

import java.util.Date;

public abstract class BillingDetails {
    private BillingDetailsType billingDetailsType;
    private String number;
    private Date createdDate;

    public BillingDetailsType getBillingDetailsType() {
        return billingDetailsType;
    }

    public void setBillingDetailsType(BillingDetailsType billingDetailsType) {
        this.billingDetailsType = billingDetailsType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
