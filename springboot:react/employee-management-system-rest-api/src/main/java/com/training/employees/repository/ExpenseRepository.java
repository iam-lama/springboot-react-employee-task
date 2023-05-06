package com.training.employees.repository;

import org.springframework.data.repository.CrudRepository;

import com.training.employees.entity.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Integer> {

}
