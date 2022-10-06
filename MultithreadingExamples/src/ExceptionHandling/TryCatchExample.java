package ExceptionHandling;

public class TryCatchExample {
	public static void main(String[] args) {
		int[] arr = new int[5];
        try 
        {
            arr[10] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"); 
        }
        finally 
        {
            System.out.println("The array is of size " + arr.length);
        }
    }

	

}
