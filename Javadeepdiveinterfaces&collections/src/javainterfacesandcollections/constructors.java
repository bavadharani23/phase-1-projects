package javainterfacesandcollections;
class Car
{
	int amount;
	String colour;
	//Parameterized constructor
	Car(int a,String C)
	{
		System.out.println("Car is created");
		amount=a;
		colour=C;
	}
	void creta()
	{
		System.out.println(amount+" "+colour);	
		System.out.println("creta belongs to hyundai company");
		
	}
}
public class constructors {
	public static void main(String[] args)
	{
		Car obj1=new Car(10000,"Blue");
		obj1.creta();
		
		
	}
}
