package tw.leonchen.collections;

import java.util.ArrayList;

public class TestArrayListEx1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		
		list1.add("john");
		list1.add("mary");
		list1.add("mary");
		list1.add(6);
		list1.add(new Integer(6));
		list1.add(3.14);
		
		System.out.println("list1"+list1);
	}

}
