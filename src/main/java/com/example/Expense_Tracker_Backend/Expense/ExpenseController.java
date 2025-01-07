package com.example.Expense_Tracker_Backend.Expense;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ExpenseController {

    private ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService){
        this.expenseService = expenseService;
    }

    @GetMapping
    public List<Expense>  findExpenses() {
        return expenseService.findExpenses();
    }

    @PostMapping
    public String addExpense(@RequestBody Expense exp){
        return "";
        
    }

    @PutMapping
    public String editExpense(@RequestBody Expense exp){
        return "expense edited";
    }

    @DeleteMapping
    public String deleteExpense(){
        return "expense deleted";
    }
}
