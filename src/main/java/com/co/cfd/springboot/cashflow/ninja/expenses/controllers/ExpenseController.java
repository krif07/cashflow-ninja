package com.co.cfd.springboot.cashflow.ninja.expenses.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.co.cfd.springboot.cashflow.ninja.expenses.entities.Expense;
import com.co.cfd.springboot.cashflow.ninja.expenses.services.IExpenseService;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    final private IExpenseService service;

    public ExpenseController(IExpenseService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<?> list() {
        return ResponseEntity.ok().body(service.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Expense> detail(@PathVariable Long id) {

        Optional<Expense> optionalExpense = service.findById(id);

        if(optionalExpense.isPresent()) {
            return ResponseEntity.ok().body(optionalExpense.get());
        }
        return ResponseEntity.notFound().build(); 
    }
    
}
