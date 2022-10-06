package demo;
import java.util.Scanner;
public class quiz {
	public static void main(String[] args) {
		System.out.println("who is cute?");
		System.out.println("1. bava\n2. anu\n3. sita\n4. geetha");
		int i;
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		if(i==1)
		{
			System.out.println("congrats ur anws is correct");
	
		}
		else
		{
			System.out.println("wrong choice");
		}
		
	}
	

}
