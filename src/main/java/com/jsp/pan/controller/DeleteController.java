package com.jsp.pan.controller;

import com.jsp.pan.service.PanService;
import com.jsp.pan.service.PersonService;

public class DeleteController {

	public static void main(String[] args) {
		PersonService personService = new PersonService();
		personService.deletePersonById(1);

		PanService panService = new PanService();
		panService.deletePanById(1);

	}

}
