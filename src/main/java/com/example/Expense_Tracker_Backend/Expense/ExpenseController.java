package com.example.Expense_Tracker_Backend.Expense;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping
    public ResponseEntity<List<Expense>> findExpenses() {
        return ResponseEntity.ok(expenseService.findExpenses());
    }

    @PostMapping
    public ResponseEntity<String> addExpense(@RequestBody Expense exp) {
        expenseService.addExpense(exp);
        return new ResponseEntity<>("Expense Created successfully", HttpStatus.CREATED);

    }

    @PutMapping
    public ResponseEntity<String> editExpense(@RequestBody Expense exp) {
        expenseService.editExpense(exp);
        return new ResponseEntity<>("Expense Edited Successfully", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteExpense(@PathVariable String id) {
        expenseService.deleteExpense(id);
        return new ResponseEntity<>("Expense Deleted Successfully", HttpStatus.OK);
    }
}
