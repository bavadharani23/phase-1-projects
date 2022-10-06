package CollectionEg;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTable {
	public static void main(String[] args) {
		Map mm1=new Hashtable(); //  by  default methods are synchronized
		mm1.put(2,"ravi");
		mm1.put(1,"radha");
		mm1.put(4,"rasmi");
		mm1.put("A", "B"); 
		mm1.put(3,"akash");
		System.out.println(mm1);
		mm1.put(2,"laks");
		mm1.put(5, "aksh");
		System.out.println(mm1);
		System.out.println(mm1.get(1));
		System.out.println(mm1.containsKey(6)); 
		System.out.println(mm1.containsValue("rasmi"));
		
		
		
		
	}


}
