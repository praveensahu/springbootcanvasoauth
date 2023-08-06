package com.canvas.repository;

import org.springframework.data.repository.CrudRepository;

import com.canvas.model.Account;

public interface AccountRepository extends CrudRepository<Account, Integer> {
}
