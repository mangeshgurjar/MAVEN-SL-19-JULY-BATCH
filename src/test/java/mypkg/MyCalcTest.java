package mypkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalcTest {
	
	MyCalc calc = new MyCalc();

	@Test
	public void test() {		
		assertEquals(70, calc.sum(50, 20));
		assertEquals(30, calc.diff(50, 20));		
	}

}
