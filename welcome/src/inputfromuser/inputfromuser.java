package inputfromuser;

import java.util.Scanner;

public class inputfromuser {
	public static void main(String[] args) {
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println(" value of n1: ");
		n1=sc.nextInt();
		System.out.println(" value of n2: ");
		n2=sc.nextInt();
		
		System.out.println("sum of two num: " +(n1+n2));
		System.out.println("Sub of two num: " +(n1-n2));
		System.out.println("multi of two num: " +(n1*n2));
		System.out.println("div of two num: " +(n1/n2));
		System.out.println("modulo of two num: " +(n1%n2));
		
	}
	
}
