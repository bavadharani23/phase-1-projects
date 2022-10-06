package ExceptionHandling;

public class TryThrowsEg {
	void Division() throws ArithmeticException
    {
        int a=5,b=0,c;
        c = a / b;
        System.out.print("\n\tThe result is : " + c);
    }
     public static void main(String[] args)
     {
      TryThrowsEg obj = new TryThrowsEg();
         try
        {
            obj.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("Error : " + Ex.getMessage());
        }
        System.out.print("\nEnd of program.");
    }


}
