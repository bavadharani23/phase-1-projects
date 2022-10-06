package javainterfacesandcollections;
class Operations
{
	int sum,diff,multi,division;
	void add(int a,int b)
	{
		sum=a+b;
		System.out.println("The value of sum is: "+sum);
	}
	void sub(int a,int b)
	{
		diff=a-b;	
		System.out.println("The value of sub is: "+diff);
	}
	void multiplication(int a,int b)
	{
		multi=a*b;
		System.out.println("The value of multi is: "+multi);
	}
	void div(int a,int b)
	{
		division=a/b;
		System.out.println("The value of division is: "+division);
	}
}
public class Methods {
	public static void main(String[] args) {
		Operations obj=new Operations();
		obj.add(10,5);
		obj.sub(30,5);
		obj.multiplication(15,2);
		obj.div(20,4);
	}

}
