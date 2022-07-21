package set_org;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//import arraylist_org.Item;

public class TestSet {

	public static void main(String[] args) {
		Set<String> fruits = new TreeSet();
		//Treeset fruits = new Treeset();
		
	//	HashSet fruits = new HashSet();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Pineapple");
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.add("Fig");
		System.out.println("treeset " + fruits);
		
		Set<String> fruits1 = new HashSet();
		
		fruits1.add("Apple");
		fruits1.add("Orange");
		fruits1.add("Banana");
		fruits1.add("Pineapple");
		fruits1.add("Grapes");
		fruits1.add("Apple");
		fruits1.add("Fig");
		System.out.println("Hashset " + fruits1);
		
		Set<String> itemList = new HashSet();
		itemList.add("TV");
		itemList.add("Mobile");
		itemList.add("Bluetooth Mic");
		itemList.add("Tripod");
		
		Set<Integer> price = new HashSet();
		price.add(4500);
		price.add(1200);
		price.add(500);
		price.add(300);
		
		Set<String> brand = new HashSet();
		brand.add("Samsung");
		brand.add("Apple");
		brand.add("Digitech");
		brand.add("Logitech");
		
		Set<Integer> qty = new HashSet();
		qty.add(4500);
		qty.add(1200);
		qty.add(500);
		qty.add(300);
		
//		itemList.add("TV", 4500, "Samsung", 1);
//		itemList.add("Mobile", 1200, "Apple", 1);
//		itemList.add("Bluetooth mic", 500, "Digitech", 1);
//		itemList.add("Tripod", 300, "Logitech", 1);
		
		System.out.println("ItemList " + itemList);
		System.out.println("Price " + price);
		System.out.println("Brand " + brand);
		System.out.println("Quantity " + qty);
	}

}
