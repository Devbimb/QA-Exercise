package com;

public class Test {

	public static void main(String[] args) {
		Liquid l=new Liquid();
		Milk m=new Milk();
		Coffee c=new Coffee();
		Tea t=new Tea();
		Mug myMug=new Mug();
		Juice j=new Juice();
		myMug.addLiquid(l);
		myMug.addLiquid(m);
		myMug.addLiquid(t);
		myMug.addLiquid(c);
		myMug.addJuice(j);

	}

}
