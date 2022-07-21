package domain;

import static org.junit.Assert.assertEquals;

import org.Calculator;
import org.junit.Test;

public class TestTwo {
	@Test
	public void checkFindBiggest()
	{
		assertEquals(50,Calculator.findBiggest(10,20,50));
		
	}
}
