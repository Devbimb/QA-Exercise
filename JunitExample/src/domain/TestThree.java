package domain;

import static org.junit.Assert.assertEquals;

import org.Calculator;
import org.junit.Test;

public class TestThree {
	@Test
	public void checkCCLength()
	{
		assertEquals(16,Calculator.checkCCNum("1234567890123456"));
		
	}
}
