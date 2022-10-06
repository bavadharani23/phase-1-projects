package javainterfacesandcollections;

public class InnerMain {
	
	public static void main(String[] args)
    {
        InnerClass.Inner in = new InnerClass().new Inner();
        in.show();
    }

}
