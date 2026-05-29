package tw.leonchen.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestHashMapEx1 {

	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		
		map1.put("1st", "mary");
		map1.put("2nd", "judy");
		map1.put("3rd", "louis");
		map1.put("3rd", "jack");

		Set keys = map1.keySet();
		Set mapping = map1.entrySet();
		Collection values = map1.values();
		
		System.out.println("keys:" + keys);
		System.out.println("values:" + values);
		System.out.println("mapping:" + mapping);
	}

}