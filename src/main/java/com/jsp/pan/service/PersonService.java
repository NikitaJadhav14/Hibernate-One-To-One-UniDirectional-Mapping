package com.jsp.pan.service;

import com.jsp.pan.dto.Person;
import com.jsp.pan.dao.*;

public class PersonService {
	PersonDao PersonDao = new PersonDao();

	public Person createPerson(Person person) {
		return PersonDao.createPerson(person);
	}

	public Person gePersonById(int id) {
		return PersonDao.getPersonByID(id);
	}

	public Person deletePersonById(int id) {
		return PersonDao.deletPerson(id);
	}

	public Person updatePerson(int id, String Name, String Email) {

		return PersonDao.updatePerson(id, Name, Email);
	}
}
