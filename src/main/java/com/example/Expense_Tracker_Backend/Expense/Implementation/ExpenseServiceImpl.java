package com.example.Expense_Tracker_Backend.Expense.Implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Expense_Tracker_Backend.Expense.Expense;
import com.example.Expense_Tracker_Backend.Expense.ExpenseService;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    private List<Expense> expenses = new ArrayList<>();


    @Override
    public void addExpense(Expense exp) {
        expenses.add(exp);
    }

    @Override
    public void deleteExpense() {
      
        
    }

    @Override
    public void editExpense() {
      
        
    }

    @Override
    public List<Expense> findExpenses() {
        return expenses;
    }
    

}
