package domain;

import org.TestUnits;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestAll {
	public static void main(String[] args) {
  //Some other
	
	Result result=JUnitCore.runClasses(TestUnits.class);
	for (Failure fail:result.getFailures())
	{
		System.out.println(fail.toString());
	}
	System.out.println("Result =" +result.wasSuccessful());
}
}
