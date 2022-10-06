package CollectionEg;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(60);
		al.add(70);
		System.out.println("the array elements are: "+al);
		System.out.println(al.get(1)); // to get the element using index position.
		al.add(1,20); // to add the element in array
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		al.set(1, 200); // to replace the element in array
		System.out.println("the array elements are: "+al);
		al.remove(2);// to remove the integer using index value
		System.out.println("the array elements are: "+al);
		al.remove(new Integer(200)); // to remove an integer using an integer value directly
		System.out.println("the array elements are: "+al);
		
		
		
		
		
		
	}

}
