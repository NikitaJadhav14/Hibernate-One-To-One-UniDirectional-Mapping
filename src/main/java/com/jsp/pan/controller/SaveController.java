package com.jsp.pan.controller;

import com.jsp.pan.dto.Pan;
import com.jsp.pan.dto.Person;
import com.jsp.pan.service.PanService;
import com.jsp.pan.service.PersonService;

public class SaveController {

	public static void main(String[] args) {
		PersonService personService = new PersonService();
		PanService panService = new PanService();

		Person person = new Person();
		person.setName("janhavi");
		person.setEmail("janhvijadhavgamil.com");
		personService.createPerson(person);

		Pan pan = new Pan();
		pan.setPanno("123");
		panService.createPan(pan);

	}

}
