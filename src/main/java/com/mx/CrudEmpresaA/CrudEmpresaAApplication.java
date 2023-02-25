package com.mx.CrudEmpresaA;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudEmpresaAApplication {
	
	public static Logger logger = LoggerFactory.getLogger(CrudEmpresaAApplication.class);
	
	@PostConstruct
	public void intt() {
		logger.info("Aplication started...");
	}
	
	public static void main(String[] args) {
		logger.info("Aplication executed...");
		SpringApplication.run(CrudEmpresaAApplication.class, args);
	}

}
