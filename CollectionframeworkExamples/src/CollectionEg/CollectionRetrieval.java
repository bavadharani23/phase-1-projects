package CollectionEg;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionRetrieval {

	public static void main(String[] args) {
		Set ss=new HashSet();
		ss.add(2);
		ss.add(4);
		ss.add(1);
		ss.add(5);
		ss.add(3);
		System.out.println(ss);
		System.out.println("For each loop");
		for(Object i:ss)// we have put object in set(becoz set store only objects not primitive datatypes) for each rather than putting int float etc.,
		{
			System.out.println(i);
		}
		System.out.println("Using iterator interface");
		Iterator ii=ss.iterator();
		while(ii.hasNext()) // hasNext is next next elements
		{
			System.out.println(ii.next()); // Print the next next elements
		}
		System.out.println("using iterator interface");
		Iterator ii1=ll.iterator();
		while(ii1.hasNext())
		{
			System.out.println(ii1.next());
		}
		ListIterator li=ll.listIterator();
		System.out.println("using list iterator-forward direction");
		
		

	}

}
