package com.jordenbrown.basicbank.JAB_BANK.accounts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID; 
	
	@Column(columnDefinition="AccountNumber")
	private String accountNumber;
	private float funds; 
	private int ownerID;
	
	public Account() {}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public float getFunds() {
		return funds;
	}
	public void setFunds(float funds) {
		this.funds = funds;
	}
	
	public int getOwnerID() {
		return ownerID;
	}
	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	} 
}
