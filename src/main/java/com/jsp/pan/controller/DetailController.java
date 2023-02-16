package com.jsp.pan.controller;

import com.jsp.pan.service.PanService;
import com.jsp.pan.service.PersonService;

public class DetailController {

	public static void main(String[] args) {
		PersonService personService = new PersonService();
		personService.gePersonById(2);

		PanService panService = new PanService();
		panService.getPanById(2);

	}

}
