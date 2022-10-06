package DataStructuresArraysAndList;
import java.util.Scanner;
public class ArrayRotation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size,rotation,i,a=0;
		System.out.println("Enter the size of array elements: ");
		size=sc.nextInt();
		System.out.println("How many times do you want to rotate: ");
		rotation=sc.nextInt();
		int arr[]=new int[size];
		int arr1[]=new int[size];
		System.out.println("Enter the array elements: ");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=rotation;i<size;i++)
		{
			arr1[a]=arr[i];
			a++;
		}
		for(i=0;i<rotation;i++)
		{
			arr1[a]=arr[i];
			a++;
		}
		System.out.println("After rotation the array elements are: ");
		for(i=0;i<size;i++)
		{
			System.out.println(arr1[i]);
		}
			
			
			
			
			
	}

}
