package com.presolved.caselifecycleserv;

import java.util.*;

public class Transaction {

    private String transaction_id;
    private float transaction_amount;
    private Date transaction_date;
    private Currency currency;

    public Transaction() {

    }

    public Transaction(String transaction_id, float transaction_amount, Date transaction_date,
            Currency transaction_currency) {
        this.transaction_id = transaction_id;
        this.transaction_amount = transaction_amount;
        this.transaction_date = transaction_date;
        this.currency = transaction_currency;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public float getTransaction_amount() {
        return transaction_amount;
    }

    public void setTransaction_amount(float transaction_amount) {
        this.transaction_amount = transaction_amount;
    }

    public Date getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency transaction_currency) {
        this.currency = transaction_currency;
    }

}
