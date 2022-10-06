package sorting;

import java.util.Scanner;

public class bubblesort {
	public static void main(String[] args) {
		int temp,i,size,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements: ");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("After sorting output will be: ");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
			
		}
	}
	


}
