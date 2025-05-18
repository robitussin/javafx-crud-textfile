package com.example;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Transaction {
    private final SimpleIntegerProperty transactionid;
    private final SimpleIntegerProperty amount;
    private final SimpleIntegerProperty customerid;
    private final SimpleStringProperty orderdate;

    public Transaction(Integer tid, Integer amt, Integer cid, String orddate) {

        this.transactionid = new SimpleIntegerProperty(tid);
        this.amount = new SimpleIntegerProperty(amt);
        this.customerid = new SimpleIntegerProperty(cid);
        this.orderdate = new SimpleStringProperty(orddate);
    }

    public Integer getTransactionid() {
        return transactionid.get();
    }

    public Integer getAmount() {
        return amount.get();
    }

    public Integer getCustomerid() {
        return customerid.get();
    }

    public String getOrderdate() {
        return orderdate.get();
    }
}
