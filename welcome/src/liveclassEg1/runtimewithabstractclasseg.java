package liveclassEg1;
abstract class A
{
	 abstract void dis1();//abstract class do no have body
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

public class runtimewithabstractclasseg {

	public static void main(String[] args) {
		//A obj1=new A(); // we cannot create objects to a abstract class 
		B obj2=new B();
		obj2.dis1();
		obj2.dis2();
		A obj3=new B();
		obj3.dis1();

	}

}
