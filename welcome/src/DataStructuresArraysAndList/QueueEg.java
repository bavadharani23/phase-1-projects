package DataStructuresArraysAndList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEg {
	public static class QueueExample 
	{
	public static void main(String[] args) 
	{
	        		Queue<String> FruitsQueue = new LinkedList<>();
	                FruitsQueue.add("Mango");
	                FruitsQueue.add("Orange");
	                FruitsQueue.add("Kiwi");
	                FruitsQueue.add("Rose Apple");
	                FruitsQueue.add("Watermelon");
	                FruitsQueue.add("Lichi");
	System.out.println("Queue is : " + FruitsQueue);
	        		System.out.println("Head of Queue : " + FruitsQueue.peek());
	        		FruitsQueue.remove();
	        		System.out.println("After removing Head of Queue : " + FruitsQueue);
	        		System.out.println("Size of Queue : " + FruitsQueue.size());
	    	}
	}


}
