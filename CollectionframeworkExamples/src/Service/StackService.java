package Service;

import java.util.Stack;

public class StackService {
	Stack obj=new Stack();
	 public String push(String Name)
	 {
		 if(obj.size()<=5)
		 {
			 obj.push(Name);
			 return "Element pushed in stack successfully";
		 }
		 else
		 {
			 return "Stack is overflow";
		 }
	 }
	 public String pop()
	 {
		 if(obj.size()>0) {
			 return (String)obj.pop();
		 }
		 else
		 {
			 return "Stack is underflow";
		 }
	 }
	 public int size() {
		 return obj.size(); 
	 }
	
	

}
