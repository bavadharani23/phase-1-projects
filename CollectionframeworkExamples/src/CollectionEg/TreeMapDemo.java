package CollectionEg;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map m1=new TreeMap(); // heterogeneous values are not allowed
		m1.put(2,"ravi");
		m1.put(1,"radha");
		m1.put(4,"rasmi");
		//m1.put("A", "B"); // Heterogeneous value(i.e, before we declared (2,ravi)(1,radha) but declaring(A,B) is heterogeneous so exception will come)
		m1.put(3,"akash");
		System.out.println(m1);
		m1.put(2,"laks");
		m1.put(5, "aksh");
		System.out.println(m1);
		System.out.println(m1.get(10)); // Tree map does not allow storing null key but null values are allowed
		System.out.println(m1.containsKey(6)); 
		System.out.println(m1.containsValue("rasmi"));
		
		
		
		
	}


}
