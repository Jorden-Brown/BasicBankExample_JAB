package com.jordenbrown.basicbank.JAB_BANK.owner.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	
	@Column(name="FirstName", length=45)
	private String firstName;
	
	@Column(name="MiddleName", length=45)
	private String middleName;
	
	@Column(name="LastName", length=45)
	private String lastName;
	
	private String dateofBirth;
	
	public Owner() {}
	
	private Owner(int ID, String firstName, String middleName, String lastName) {
		this.firstName = firstName; 
		this.middleName = middleName; 
		this.lastName = lastName; 
	}

    static Owner from(int ID, String firstName, String middleName, String lastName) {
        return new Owner(ID, firstName, middleName, lastName);
    }

	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	

}


