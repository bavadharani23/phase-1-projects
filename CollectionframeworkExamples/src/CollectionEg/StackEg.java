package CollectionEg;
import java.util.Stack;
public class StackEg {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s);
		System.out.println(s.pop()); // It will remove the last element
		System.out.println(s);
		System.out.println(s.peek());// It will display the last element but will not delete it.
		System.out.println(s);
		System.out.println(s.search(10)); // (30=1st position(as it is last element), (20=second ),(30=3rd position)it will check from last value and display the position of element if present
		System.out.println(s.search(100)); // Returns -1 if not present
		
		
		
		

	}

}
