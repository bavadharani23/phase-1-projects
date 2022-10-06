package CollectionEg;
import java.util.HashSet;
class A
{
	
}
class B
{
	
}
public class HashSetEx {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		int a=4;//primitive value
		Integer b=new Integer(a);// converting primitive to object
		hs.add(b);
		hs.add(30); // After storing it is an object not a primitive
		hs.add(10.0);// THis is autoboxing nowadays automatically the software itself coverts primitive to object value.
		hs.add("Ravi"); // Hash set can store int,float,char,boolean and user defined objects also
		hs.add(true);
		A obj1=new A();
		B obj2=new B();
		hs.add(obj1);
		hs.add(obj2);
		System.out.println(hs);
		
		
		
	}

}
