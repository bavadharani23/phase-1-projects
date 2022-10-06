package CollectionEg;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map mm=new HashMap(); // it is unordered(i.e, it will display in ascending it will not display the values as we declared as it is.
		mm.put(2,"ravi");
		mm.put(1,"radha");
		mm.put(4,"rasmi");
		mm.put("A", "B"); // In hashmap heterogeneous keys can be stored
		mm.put(3,"akash");
		System.out.println(mm);
		mm.put(2,"laks");// it will not allow duplicate value it will replace the value
		mm.put(5, "aksh");
		System.out.println(mm);
		System.out.println(mm.get(1));
		System.out.println(mm.containsKey(6)); // becoz the num 6 is not there so false
		System.out.println(mm.containsValue("rasmi"));
		
		
		
		
	}

}
