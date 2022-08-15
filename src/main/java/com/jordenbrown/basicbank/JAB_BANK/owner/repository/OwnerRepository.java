package com.jordenbrown.basicbank.JAB_BANK.owner.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jordenbrown.basicbank.JAB_BANK.owner.model.Owner;


	
	@Repository
	public interface OwnerRepository extends JpaRepository<Owner, Long> {

	}
	




