package com.ysp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void assert_add() {
		Calculator c = new Calculator();
		int result =c.add(10, 20);
		assertEquals(30, result);
	}
	
	@Test
	void assert_sub() {
		Calculator c = new Calculator();
		int result =c.sub(20, 10);
		assertEquals(10, result);
	}

}