package CollectionEg;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithoutGenerics {
	public static void main(String[] args) {
		// collection framework without generics(without generics is difficult because we have to keep track of all variables and datatypes to retrieve the data)
		List ll1=new ArrayList();
		ll1.add(10);
		ll1.add(10.10);
		ll1.add("raju");
		ll1.add(true);
		
		Object obj=ll1.get(0);
		Integer i=(Integer)obj; //downlevel typecasting
		int n=i.intValue(); // converting object to primitive
		System.out.println(n);
		
		Object obj1=ll1.get(1);
		Double f=(Double)obj1; //downlevel typecasting
		double m=f.doubleValue(); // converting object to primitive
		System.out.println(m);
		
	}

}
