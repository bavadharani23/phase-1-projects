package javadeepdivingclass;
import java.util.Scanner;
public class ArithmeticCalculator {
	public static void main(String[] args) {
		double num1,num2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of num1: ");
		num1=sc.nextDouble();
		System.out.println("Enter the value of num2: ");
		num2=sc.nextDouble();
		char operator;
		System.out.println("Choose an operator: +, -, *, or /");
		operator=sc.next().charAt(0);
		switch(operator)
		{
		case '+' :
			System.out.println("Addition of two numbers will be "+(num1+num2) );
			break;
		case '-' :
			System.out.println("Subtraction of two numbers will be "+(num1-num2) );
			break;
		case '*' :
			System.out.println("Multiplication of two numbers will be "+(num1*num2) );
			break;
		case '/' :
			System.out.println("Division of two numbers will be "+(num1/num2) );
			break;
		default:
			System.out.println("Something is wrong, Please check again");
			
		}
	}
}
