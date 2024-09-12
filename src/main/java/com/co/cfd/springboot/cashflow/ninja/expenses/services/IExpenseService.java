package com.co.cfd.springboot.cashflow.ninja.expenses.services;

import java.util.List;
import java.util.Optional;

import com.co.cfd.springboot.cashflow.ninja.expenses.entities.Expense;

public interface IExpenseService {
    List<Expense> findAll();
    Optional<Expense> findById(Long id);
}
