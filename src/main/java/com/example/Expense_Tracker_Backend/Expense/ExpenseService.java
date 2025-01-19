package com.example.Expense_Tracker_Backend.Expense;

import java.util.List;
import java.util.UUID;

public interface ExpenseService {
    List<Expense> findExpenses();
    List<Expense> findExpensesByUser(UUID id);
    void addExpense(Expense exp);
    void editExpense(Expense exp);
    void deleteExpense(UUID id);
    

}
