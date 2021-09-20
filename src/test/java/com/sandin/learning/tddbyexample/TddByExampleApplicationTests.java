package com.sandin.learning.tddbyexample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TddByExampleApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);

		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}

	@Test
	public void testEquality() {
		assertTrue( new Dollar(5).equals(new Dollar(5)));

		assertFalse( new Dollar(5).equals(new Dollar(6)));
	}
}
