package com.example.Expense_Tracker_Backend.Expense;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
public interface ExpenseRepository extends JpaRepository<Expense, UUID> {
    List<Expense> findByUserId(UUID userId);

}