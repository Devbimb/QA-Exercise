package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestAnnotation {
	private ArrayList<String> list;
	@BeforeClass // before all the test classees
	public static void m1()
	{
		System.out.println("@BeforeClass");
	}
	
	@Before //before each Test
	public void m2()
	{
		list = new ArrayList<String>();
		System.out.println("@Before");
	}
	@Test
	public void m6()
	{
		list.add("Upasana");
		assertFalse(list.isEmpty());
		assertEquals(1,list.size());
	}
	
	@Test
	public void checkFindBig()
	{
		//assertEquals(para1,para2)
		//assertEquals(resulExpected,calculatingtheresult)
		assertEquals(20,Calculator.findBig(10,20));
	}
	
	@Test
	public void checkFindBiggest()
	{
		assertEquals(50,Calculator.findBiggest(10,20,50));
		
	}
	
	@Test
	public void checkCCLength()
	{
		assertEquals(16,Calculator.checkCCNum("1234567890123456"));
	}
	@After
	public void m3()
	{
		System.out.println("@After");
	}
	@AfterClass
	public static void m4()
	{
		System.out.println("AfterClass");
	}
	@Ignore
	public void m5()
	{
		System.out.println("@Ignored");
	}
	
}
