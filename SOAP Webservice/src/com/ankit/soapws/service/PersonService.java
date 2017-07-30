package com.ankit.soapws.service;

import com.ankit.soapws.bean.Person;

public interface PersonService {
	
	public boolean addPerson(Person p);
	
	public boolean deletePerson(int id);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();
}
