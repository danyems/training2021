package org.fujitsu.training.codes;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMathematics {
	
	private Mathematics math;
	
	@BeforeEach
	public void startup() {
		math = new Mathematics();
	}
	
	@AfterEach
	public void teardown() {
		math = null;
	}
	
	//@Test
	public void testSum01() {
		math.add(10, 10);
	}
	
	@Test
	public void testDiv01() {
		try {
			math.div(10, 0);
		} catch (ArithmeticException e) {
			fail(e.getMessage());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	

}
