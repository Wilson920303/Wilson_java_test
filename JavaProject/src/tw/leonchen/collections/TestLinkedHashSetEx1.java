package tw.leonchen.collections;

import java.util.LinkedHashSet;

public class TestLinkedHashSetEx1 {
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	public static void main(String[] args) {
		LinkedHashSet set2 = new LinkedHashSet();
		
		set2.add("mary");
		set2.add("mary");
		set2.add("john");
		set2.add(6);
		set2.add(6);
		set2.add(3.14);
		
		System.out.println("set2:" + set2);
	}

}
