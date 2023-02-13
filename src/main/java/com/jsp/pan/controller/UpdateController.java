package com.jsp.pan.controller;

import com.jsp.pan.service.PanService;
import com.jsp.pan.service.PersonService;

public class UpdateController {

	public static void main(String[] args) {
		PersonService personService = new PersonService();
		personService.updatePerson(1, "nikita", "nikitajadhav@gamil.com");

		PanService panService = new PanService();
		panService.updatePan(1, "456");

	}

}
