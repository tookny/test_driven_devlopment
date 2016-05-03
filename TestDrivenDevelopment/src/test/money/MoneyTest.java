package test.money;

import static org.junit.Assert.*;

import org.junit.Test;

import main.money.Dollar;
import main.money.Franc;

public class MoneyTest {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
		
		assertFalse(new Dollar(20).equals(five.times(3)));
	}
	
	@Test
	public void testFrancMultiplication() {
		Franc five = new Franc(5);
		assertEquals(new Franc(10), five.times(2));
		assertEquals(new Franc(15), five.times(3));
		
	}
	
	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(6).equals(new Dollar(5)));
	}
	
	//TODO : hashmap test - only equals?
}

