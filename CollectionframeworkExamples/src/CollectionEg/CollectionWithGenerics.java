package CollectionEg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionWithGenerics {
	public static void main(String[] args) {
		List<Integer> ll=new ArrayList<Integer>();
		ll.add(10);
		ll.add(20);
		int n=ll.get(0);
		System.out.println(n);
		
		Map<Integer,String> mm=new HashMap<Integer,String>();
		mm.put(1, "Ramesh");
		mm.put(2, "lokesh");
		System.out.println(mm);
		
	}

}
