package org.fujitsu.training.codes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doNothing;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestMathematics {
	
	private String s1;
	
	//record stage
	//@Mock sa mockito, @Mocked sa JMockit
	@Mock
	private Mathematics math;
	
	@Spy
	private ArrayList<String> arrList;
	//private Mathematics mathSpy = new Mathematics();
	
	@BeforeEach
	public void startup() {
		arrList.add("Fe");
		s1 = "abcdefghi"; 
	}
	
	@AfterEach
	public void teardown() {
		arrList = null;
	}
	
	//@Test
	public void testSum01() {
		
		//make sure na gagamitin mo ung mock (when)
		// i sysout or assert
		when(math.div(10, 10)).thenReturn(1);
		when(math.div(10, 0)).thenReturn(0);
		when(math.div(10, 60)).thenReturn(0);
		when(math.div(10, 50)).thenReturn(0);
		
		Assertions.assertTrue(math.div(10, 10) == 1);
		System.out.println();
		System.out.println(math.div(10, 0));
		System.out.println(math.div(10, 60));
		System.out.println(math.div(10, 50));
		
	}
	
	@Test
	public void testDiv02() {
		
		//doReturn("Fe").when(arrList).get(0);
		//when(arrList.get(0)).thenReturn("100");
		//doReturn(true).when(math).display();
		
		assertEquals("ef", s1.substring(4,6));
		//assertEquals("100", arrList.get(0));
	}

	
	//@Test
	public void testDiv03() {
		
		when(math.div(10, 0)).thenThrow(ArithmeticException.class);
		
		assertThrows(ArithmeticException.class, () -> {
			math.div(10, 0);
		});
		
	}
	
	//@Test
	public void testDiv04() {
		
		doNothing().when(math).display();
		
		math.display();
		
	}
	
	

}
