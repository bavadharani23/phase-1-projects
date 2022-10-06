package CollectionEg;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(1,100); // to insert the element in 1st index position
		System.out.println(ll);
		ll.remove(2);// to remove the element in 2nd index position
		ll.remove(new Integer(20)); // To remove the integer value directly
		System.out.println(ll);
		ll.addFirst(1); //To add the element in 1st position
		ll.addLast(2); // To remove the element in last position
		System.out.println(ll);
		ll.removeFirst(); // To remove the first value
		ll.removeFirst();
		System.out.println(ll);
		

	}

}
