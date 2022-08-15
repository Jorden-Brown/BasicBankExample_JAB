package com.jordenbrown.basicbank.JAB_BANK.accounts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jordenbrown.basicbank.JAB_BANK.accounts.model.Account;
import com.jordenbrown.basicbank.JAB_BANK.accounts.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepository; 
	
	public List<Account> getAccounts(){
		return accountRepository.findAll(); 
	}
}
