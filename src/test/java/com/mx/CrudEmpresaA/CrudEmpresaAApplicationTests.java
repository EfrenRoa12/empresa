package com.mx.CrudEmpresaA;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CrudEmpresaAApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(CrudEmpresaAApplication.class);
	
	@Test
	public void contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true, true);
	}

}
