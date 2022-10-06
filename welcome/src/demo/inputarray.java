package demo;
import java.util.Scanner;
public class inputarray {
	public static void main(String[] args) {
		int size,i;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int arr[]=new int[size];
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
