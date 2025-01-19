package com.example.Expense_Tracker_Backend.Expense.Implementation;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Expense_Tracker_Backend.Expense.Expense;
import com.example.Expense_Tracker_Backend.Expense.ExpenseRepository;
import com.example.Expense_Tracker_Backend.Expense.ExpenseService;
import com.example.Expense_Tracker_Backend.User.UserRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addExpense(Expense exp) {
        UUID userId = exp.getUserId();

        // We no longer need to fetch the User entity, just use userId
        if (!userRepository.existsById(userId)) {
            throw new RuntimeException("User not found with ID: " + userId);
        }

        expenseRepository.save(exp); // Save the expense with userId directly
    }

    @Override
    public void deleteExpense(UUID id) {
        if (!expenseRepository.existsById(id)) {
            throw new RuntimeException("Expense with ID " + id + " not found.");
        }
        expenseRepository.deleteById(id);
    }

    @Override
    public void editExpense(Expense exp) {
        Expense existingExpense = expenseRepository.findById(exp.getId())
                .orElseThrow(() -> new RuntimeException("Expense with ID " + exp.getId() + " not found."));

        existingExpense.setAmount(exp.getAmount());
        existingExpense.setCategory(exp.getCategory());
        existingExpense.setDate(exp.getDate());

        // Check if userId exists before updating
        if (exp.getUserId() != null) {
            if (!userRepository.existsById(exp.getUserId())) {
                throw new RuntimeException("User with ID " + exp.getUserId() + " not found.");
            }
            existingExpense.setUserId(exp.getUserId()); // Update the userId directly
        }

        expenseRepository.save(existingExpense);
    }

    @Override
    public List<Expense> findExpenses() {
        return expenseRepository.findAll();
    }

    @Override
    public List<Expense> findExpensesByUser(UUID userId) {
        if (!userRepository.existsById(userId)) {
            throw new RuntimeException("User with ID " + userId + " not found.");
        }
        return expenseRepository.findByUserId(userId); // Query by userId directly
    }

}
