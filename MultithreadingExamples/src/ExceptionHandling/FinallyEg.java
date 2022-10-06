package ExceptionHandling;

public class FinallyEg {
	public static void main(String[] args)
    {
        int a=5,b=0,c=0;
        try
        {
            c = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\n\tThe result is : " + c);
        }
    }


}
