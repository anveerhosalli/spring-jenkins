package com.project.jenkin.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	
	@Test
	public void contextLoads() {
		logger.info("Execting test case");
		assertEquals(true, true);
	}
	
	@Test
	public void test() {
		logger.info("in test");
		assertEquals(2, 2);
	}

}
