package com.jordenbrown.basicbank.JAB_BANK.owner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jordenbrown.basicbank.JAB_BANK.owner.model.Owner;
import com.jordenbrown.basicbank.JAB_BANK.owner.repository.OwnerRepository;

@Service
public class OwnerService {
	@Autowired 
	private OwnerRepository ownerRepository;
	
	public List<Owner> getOwners(){
		return ownerRepository.findAll();
	}
}



