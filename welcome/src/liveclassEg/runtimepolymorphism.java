package liveclassEg;
class A
{
	void dis1()
	{
		System.out.println("A class dis1 method" );
		
	}
}
class B extends A
{
	void dis1()
	{
		System.out.println("A class dis1 method override by b class" );
		
	}
	void dis2()
	{
		System.out.println("B class dis1 method" );
	}
}

public class runtimepolymorphism {

	public static void main(String[] args) {
		/*this side class is reference class*/A obj1=new A();//This side class is object class
		B obj2=new B();
		obj1.dis1();
		obj2.dis1();
		obj2.dis2();
		//B obj3=new A();
		A obj4=new B();
		obj4.dis1();
		
		

	}

}
