package com.example.Expense_Tracker_Backend.Expense;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Expense {

    @Id
    @GeneratedValue
    private UUID id; // Auto-generated UUID for the expense ID

    private UUID userId; // Store the userId directly

    private String category;
    private Date date;
    private int amount;

    public Expense() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
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

    public Expense(UUID userId, String category, Date date, int amount) {
        this.userId = userId;
        this.category = category;
        this.date = date;
        this.amount = amount;
    }
}
