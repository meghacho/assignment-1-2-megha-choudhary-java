package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class SlowApiTest {

	private SlowApi api;

	@BeforeEach
	void setUp() throws Exception {
		api = new SlowApi();
	}

	@Test
	void SlowApiTest2() {
		Assertions.assertTimeout(Duration.ofSeconds(6), ()->api.getCityName("110051") );
	}
	
//	@Test
//	@Timeout(unit = TimeUnit.SECONDS, value = 4)
//	void SlowApiTest1() {
//		assertEquals("delhi", api.getCityName("110051"));
//	}

	@AfterEach
	void tearDown() throws Exception {
		api = null;
	}

}
