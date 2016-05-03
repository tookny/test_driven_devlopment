package test.money;

import static org.junit.Assert.*;

import org.junit.Test;

import main.money.Dollar;
import main.money.Franc;
import main.money.Money;

public class MoneyTest {

	
	public void testMultiplication() {
		Dollar five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
		
		assertFalse(Money.dollar(20).equals(five.times(3)));
	}
	

	public void testFrancMultiplication() {
		Franc five = Money.franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
		
	}
	
	@Test
	public void testEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(6).equals(Money.dollar(5)));
		
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(6).equals(Money.franc(5)));
		
		//assertTrue( Money.franc(5).equals(Money.dollar(5)));
		assertFalse( Money.franc(5).equals(Money.dollar(5)));
	}
	
	//TODO : hashmap test - only equals?
}

