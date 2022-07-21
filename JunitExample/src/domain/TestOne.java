package domain;

import static org.junit.Assert.assertEquals;

import org.Calculator;
import org.junit.Test;

public class TestOne {
	@Test
	public void checkFindBig()
	{
		//assertEquals(para1,para2)
		//assertEquals(resulExpected,calculatingtheresult)
		assertEquals(20,Calculator.findBig(10,20));
	}
}
