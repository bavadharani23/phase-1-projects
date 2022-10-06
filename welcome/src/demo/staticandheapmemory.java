package demo;

class info
{
	int a;
	static int b;
	void display()
	{
		System.out.println("instance variable "+a);
		System.out.println("static variable "+b);
		
	}
}

public class staticandheapmemory {
	public static void main(String[] args) {
		info obj1=new info();
		info obj2=new info();
		obj1.a=10;
		obj1.b=20;
		info.b=30;
		
		obj2.a=40;
		obj2.b=50;
		info.b=60;
		
		obj1.display();
		obj2.display();
		
	}

}
