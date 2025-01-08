package com.example.Expense_Tracker_Backend.Expense;

import java.util.List;

public interface ExpenseService {
    List<Expense> findExpenses();
    void addExpense(Expense exp);
    void editExpense(Expense exp);
    void deleteExpense(String id);

}
