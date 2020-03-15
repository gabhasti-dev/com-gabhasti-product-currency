package com.bank.core.service.currency.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyService {

	private static final Logger log = LogManager.getLogger();

	@GetMapping("/hello")
	public String getHello() {
		System.out.println();
		log.debug("Welcome to Ghabhasti series");

		log.debug(" we shall exit from this");
		log.error(" I am erroroing ");
		log.fatal("I am fateling");

		return "Docker success by Gabhasti";
	}

}
