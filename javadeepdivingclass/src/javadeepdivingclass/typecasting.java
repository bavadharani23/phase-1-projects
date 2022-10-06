package javadeepdivingclass;
import java.util.Scanner;
public class typecasting {
	public static void main(String[] args) {
	     int a=10;
	     long b=a;
	     float c=b;
	     //Widening or implicit type casting
	     System.out.println("Implicit Typecasting: ");
	     System.out.println("Int value "+a);
	     System.out.println("Long value "+b);
	     System.out.println("Float value "+c);
	     
	     System.out.println("Explicit Typecasting: ");
	     double x=120.04;
	     int y= (int)x;
	     //Narrowing or explicit type casting
	     System.out.println("Int value "+y);
	}

}
