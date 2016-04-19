package test.money;

import static org.junit.Assert.*;

import org.junit.Test;

import main.money.Dollar;

public class MoneyTest {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
		
	}

}
