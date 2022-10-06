package CollectionEg;
import java.util.TreeSet;
public class TreeSetEg {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(11);
		ts.add(3);
		ts.add(12);
		ts.add(19);// Treeset can store the values of same datatype.
		ts.add(15);
		System.out.println(ts);// By default it will display in ascending order
		System.out.println(ts.headSet(11));// It will display the before values of 11
		System.out.println(ts.tailSet(11));// It will display the value 11 and after value of 11
		System.out.println(ts.subSet(11,15));// values between 11 and 15
		System.out.println(ts.remove(15));
		System.out.println(ts);
	}

}
