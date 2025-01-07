package com.example.Expense_Tracker_Backend.Expense;

import java.sql.Date;

public class Expense {
    private String id;
    private String userid;
    private String category;
    private Date date;
    private int amount;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Expense(String id, String userid, String category, Date date, int amount) {
        this.id = id;
        this.userid = userid;
        this.category = category;
        this.date = date;
        this.amount = amount;
    }

    
}
