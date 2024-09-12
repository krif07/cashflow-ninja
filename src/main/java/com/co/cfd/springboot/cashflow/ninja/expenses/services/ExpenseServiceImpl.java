package com.co.cfd.springboot.cashflow.ninja.expenses.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.co.cfd.springboot.cashflow.ninja.expenses.entities.Expense;
import com.co.cfd.springboot.cashflow.ninja.expenses.repositories.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements IExpenseService {

    final private ExpenseRepository expenseRepository;

    public ExpenseServiceImpl(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Expense> findAll() {
        return (List<Expense>) expenseRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Expense> findById(Long id) {
       return expenseRepository.findById(id);
    }

}
