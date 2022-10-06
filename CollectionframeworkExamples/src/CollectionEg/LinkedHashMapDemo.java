package CollectionEg;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		Map m=new LinkedHashMap(); //  It will maintain the order as we declared
		m.put(1,"radha");
		m.put(4,"rasmi");
		m.put("A", "B"); 
		m.put(3,"akash");
		System.out.println(m);
		m.put(2,"laks");
		m.put(5, "aksh");
		System.out.println(m);
		System.out.println(m.get(1));
		System.out.println(m.containsKey(6)); 
		System.out.println(m.containsValue("rasmi"));
		
		
		
		
	}


}
