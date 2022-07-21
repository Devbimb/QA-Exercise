package com;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Bed> bedList = new ArrayList();
		Bed b1 = new Bed();
		Bed b2 = new Bed();
		Bed b3 = new Bed();
		bedList.add(b1);
		bedList.add(b2);
		bedList.add(b3);
		FurnitureTest obj1 = new FurnitureTest();
		obj1.makeFurnitures(bedList);
		
		List<Chair> chairList = new ArrayList();
		Chair ch1 = new Chair();
		Chair ch2 = new Chair();
		Chair ch3 = new Chair();
		chairList.add(ch1);
		chairList.add(ch2);
		chairList.add(ch3);
		obj1.makeFurnitures(chairList);
		
		List<Wardrobe> wardList = new ArrayList();
		Wardrobe w1 = new Wardrobe();
		Wardrobe w2 = new Wardrobe();
		Wardrobe w3 = new Wardrobe();
		wardList.add(w1);
		wardList.add(w2);
		wardList.add(w3);
		obj1.makeFurnitures(wardList);
		
	}

}