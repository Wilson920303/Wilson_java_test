package tw.leonchen.collections.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIteratorWithArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("banana");
		list1.add("apple");
		list1.add("grape");
		list1.add("pineapple");
		list1.add("durian");
		list1.add("dragonfruit");
		
		System.out.println("list1:" + list1);
		
		Iterator<String> i1 = list1.iterator();
		while(i1.hasNext()) {
			String result =i1.next();
			System.out.println("result:" + result);
			}
		

	}

}
