package javainterfacesandcollections;
import java.util.*;
public class Collections {
	public static void main(String[] args) 
	{
		System.out.println("ArrayList");
		ArrayList<String> states=new ArrayList<String>();   
	      states.add("Tamilnadu");
	      states.add("Maharastra");    	   
	      System.out.println(states);  
		
		//creating Linkedlist
	      System.out.println("\n");
	      System.out.println("Linkedlist");
	      LinkedList<String> fruits=new LinkedList<String>();  
	      fruits.add("Mango");  
	      fruits.add("Apple");  
	      fruits.add("Kiwi"); 
	      Iterator<String> itr=fruits.iterator();  
	      while(itr.hasNext()){  
	      System.out.println(itr.next());  
	      
	      //Creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<String> v = new Vector<String>();
	      v.add("Ravi"); 
	      v.add("Radha"); 
	      System.out.println(v);

	       //creating stack
	      System.out.println("\n");
	      System.out.println("Stack");
	      Stack<String> stack = new Stack<String>();  
	      stack.push("Ayush");  
	      stack.push("Garvit");  
	      stack.push("Amit");  
	      stack.push("Ashish");  
	      stack.push("Garima");  
	      stack.pop();  
	      Iterator<String> iter=stack.iterator();  
	      while(iter.hasNext()){  
	      System.out.println(iter.next());  
	      }  
	      
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(10);  
	       set.add(12);  
	       set.add(11);
	       set.add(13);
	       System.out.println(set);
	       
	       
	      	} 
	      }  
	

	}

