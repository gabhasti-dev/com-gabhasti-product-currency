package com.bank.core.service.currency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.bank.core.service.currency.api"})
public class ServiceCurrencyApplication {

	
	public static void main(String[] args) {
	
		SpringApplication.run(ServiceCurrencyApplication.class, args);
	}

}
