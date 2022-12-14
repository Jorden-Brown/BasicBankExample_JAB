package com.jordenbrown.basicbank.JAB_BANK.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jordenbrown.basicbank.JAB_BANK.accounts.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
