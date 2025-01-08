package com.example.Expense_Tracker_Backend.Expense.Implementation;

import java.util.ArrayList;
import java.util.Iterator;
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
    public void deleteExpense(String id) {
        for (Iterator<Expense> iterator = expenses.iterator(); iterator.hasNext();) {
            Expense e = iterator.next();
            if (e.getId().equals(id)) {
                iterator.remove();
            }
        }
    }

    @Override
    public void editExpense(Expense exp) {
        for (Expense e : expenses) {
            if (e.getId().equals(exp.getId())) {
                e.setAmount(exp.getAmount());
                e.setCategory(exp.getCategory());
                e.setDate(exp.getDate());
            }
        }

    }

    @Override
    public List<Expense> findExpenses() {
        return expenses;
    }

}
