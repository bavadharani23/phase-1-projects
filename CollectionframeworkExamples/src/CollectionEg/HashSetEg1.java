package CollectionEg;
import java.util.HashSet;
public class HashSetEg1 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		System.out.println("size" +hs.size());
		System.out.println("Empty "+hs.isEmpty());
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		HashSet hs1=new HashSet();
		hs1.add(100);
		hs1.add(200);
		hs1.add(300);
		System.out.println(hs);
		System.out.println("size" +hs.size());
		System.out.println("Empty "+hs.isEmpty());
		hs.add(hs1);// THis is addall method.
		System.out.println("size" +hs.size());// it will show the size of hashset
		System.out.println(hs);
		System.out.println("Search "+hs.contains(2));// contains is used to search the element
		System.out.println("Search "+hs.contains(400));
		System.out.println("Remove "+hs.remove(1));// remove is used to remove a particular element
		System.out.println("Remove "+hs.remove(500));
		System.out.println(hs);
		hs.clear();// It is used to remove all the elements
		System.out.println(hs);
		
		
		
		
		
		
	}

}
