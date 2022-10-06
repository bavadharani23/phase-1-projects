package demo;
interface abc
{
	int A=10;
	void dis1();
}
interface mnc
{
	int B=20;
	void dis2();
}
interface xyz extends abc,mnc
{
	int C=30;
	void dis3();
}
class Demo implements abc,mnc
{
	//here we have to give public infront of void because interface methods are by default public abstract method
	public void dis1()
	{
		System.out.println("This is abc interface example");
	}
	public void dis2()
	{
		System.out.println("This is mnc interface example");	
	}
}
public class InterfaceExample {
	public static void main(String[] args)
	{
		Demo obj=new Demo();
		obj.dis1();
		obj.dis2();
	}

}
