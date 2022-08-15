package com.jordenbrown.basicbank.JAB_BANK.owner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jordenbrown.basicbank.JAB_BANK.owner.model.Owner;
import com.jordenbrown.basicbank.JAB_BANK.owner.service.OwnerService;

@RestController
public class OwnerController {
	
	@Autowired
	private OwnerService ownerService; 
	
	@GetMapping("/owner/test")
	public ResponseEntity<String> DoBasicTest() {
		return ResponseEntity.ok("True");
}
	@GetMapping("/owner/getAllOwners")
	public ResponseEntity<List<Owner>> getOwners(){
		return ResponseEntity.ok(ownerService.getOwners());
	}
}

