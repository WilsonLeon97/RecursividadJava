package model;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AlgorithmsRecursiveTest {

	@Test
	public void testCalcFactorial() {
		assertEquals(1, AlgorithmsRecursive.calcFactorial(0));
		assertEquals(1, AlgorithmsRecursive.calcFactorial(1));
		assertEquals(2, AlgorithmsRecursive.calcFactorial(2));
		assertEquals(6, AlgorithmsRecursive.calcFactorial(3));
		assertEquals(24, AlgorithmsRecursive.calcFactorial(4));
		assertEquals(120, AlgorithmsRecursive.calcFactorial(5));
		assertEquals(720, AlgorithmsRecursive.calcFactorial(6));
		assertEquals(5040, AlgorithmsRecursive.calcFactorial(7));
		assertEquals(40320, AlgorithmsRecursive.calcFactorial(8));
		assertEquals(362880, AlgorithmsRecursive.calcFactorial(9));
		assertEquals(3628800, AlgorithmsRecursive.calcFactorial(10));
		assertEquals(39916800, AlgorithmsRecursive.calcFactorial(11));
		assertEquals(479001600, AlgorithmsRecursive.calcFactorial(12));
		assertEquals(6227020800l, AlgorithmsRecursive.calcFactorial(13));
	}

	@Test
	public void testCalcSumatoria() {
		assertEquals(15, AlgorithmsRecursive.calcSumatoria(5));
	}
	
	@Test
	public void testCalcFibonacci() {
		assertEquals(5, AlgorithmsRecursive.calcFibonacci(5));
		assertEquals(6765, AlgorithmsRecursive.calcFibonacci(20));
	}
	
	@Test
	public void testCalcDiv() {
		assertEquals(6, AlgorithmsRecursive.calcDiv(18, 3));
		assertEquals(25, AlgorithmsRecursive.calcDiv(50, 2));
		assertEquals(2, AlgorithmsRecursive.calcDiv(5, 2));
	}
	
	@Test
	public void testIsCousing() {
		assertTrue(AlgorithmsRecursive.isCousing(1));
		assertTrue(AlgorithmsRecursive.isCousing(2));
		assertTrue(AlgorithmsRecursive.isCousing(3));
		assertTrue(AlgorithmsRecursive.isCousing(5));
		assertTrue(AlgorithmsRecursive.isCousing(7));
		assertTrue(AlgorithmsRecursive.isCousing(47));
		assertTrue(AlgorithmsRecursive.isCousing(19));
		assertFalse(AlgorithmsRecursive.isCousing(49));
		
	}
	
	
	@Test
	public void testCuentaCifras() {
		assertEquals(4, AlgorithmsRecursive.CuentaCifras(6765));
		assertEquals(5, AlgorithmsRecursive.CuentaCifras(67657));
		assertEquals(6, AlgorithmsRecursive.CuentaCifras(832763));
		assertEquals(7, AlgorithmsRecursive.CuentaCifras(4764373));
		assertEquals(8, AlgorithmsRecursive.CuentaCifras(73564384));
		assertEquals(9, AlgorithmsRecursive.CuentaCifras(245267354));
		assertEquals(10, AlgorithmsRecursive.CuentaCifras(7643673635l));
		assertEquals(11, AlgorithmsRecursive.CuentaCifras(24343456566l));
		
		
		
		
		
		
		
	}

}
