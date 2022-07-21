package com;

import java.util.List;

public class FurnitureTest {
	public void makeFurnitures(List<? extends Furniture> list)
	{
		for(Furniture f:list) 
		{
			f.make();
		}
	}
}
