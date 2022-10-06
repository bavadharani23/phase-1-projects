package javainterfacesandcollections;

public class overloading {
	void add(int x,int y)
	{
		System.out.println(+(x+y));
	}
	void add(int a,int b,int c)
	{
		System.out.println(+(a+b+c));
		
	}
	public static void main(String[] args)
	{
		overloading obj=new overloading();
		obj.add(5, 6);
		obj.add(1,2,3);
	}
}
