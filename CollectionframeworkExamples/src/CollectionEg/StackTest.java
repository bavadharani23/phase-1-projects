package CollectionEg;
import java.util.Scanner;
import Service.StackService;
public class StackTest {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		StackService obj1=new StackService();
		String con="";
		String data;
		do {
			System.out.println("1: Push 2 : Pop 3 : Size");
			System.out.println("Enter your choice");
			int key = obj.nextInt();
			switch (key) {
			case 1:	System.out.println("Enter the data to push in stack");
			            data = obj.next();
						System.out.println(obj1.push(data));
						break;
			case 2 : System.out.println("Pop the item from a stack");
			             System.out.println(obj1.pop());
						break;
			case 3: System.out.println("Size of stack is "+obj1.size());
						break;
			default:System.out.println("Wrong choice");
						break;
			}
			System.out.println("Do you want to continue?");
			con = obj.next();
		} while (con.equalsIgnoreCase("y"));
		System.out.println("Thank You");
		
	}

}
