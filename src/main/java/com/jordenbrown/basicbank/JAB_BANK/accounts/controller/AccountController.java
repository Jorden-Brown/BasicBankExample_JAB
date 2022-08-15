package com.jordenbrown.basicbank.JAB_BANK.accounts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jordenbrown.basicbank.JAB_BANK.accounts.model.Account;
import com.jordenbrown.basicbank.JAB_BANK.accounts.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService; 
	
	@GetMapping("/account/test")
	public ResponseEntity<String> DoBasicTest() {
		return ResponseEntity.ok("True");
	}
	
	@GetMapping("/account/getAllAccounts")
	public ResponseEntity<List<Account>> getAccounts(){
		return ResponseEntity.ok(accountService.getAccounts());
	}
	
}
