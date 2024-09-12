package com.co.cfd.springboot.cashflow.ninja.expenses.repositories;

import org.springframework.data.repository.CrudRepository;

import com.co.cfd.springboot.cashflow.ninja.expenses.entities.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Long>{

}
