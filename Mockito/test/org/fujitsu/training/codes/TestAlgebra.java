package org.fujitsu.training.codes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestAlgebra {
	
	@Mock
	private Mathematics math;
	
	@InjectMocks
	private Algebra algebra = new Algebra(math);
	
	@Test
	public void testGetExpression01() {
		
		when(math.div(10, 0)).thenReturn(10);
		
		assertEquals(2020, algebra.getExpression(10, 0));
		
		verify(math, times(2)).div(10, 0);
		
	}

}
