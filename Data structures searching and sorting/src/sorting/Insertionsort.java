package sorting;
import java.util.Scanner;
public class Insertionsort {
	public static void main(String[] args) {
		int size,i,j,min,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements: ");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=1;i<size;i++)
		{
			temp=arr[i];
			j=i-1;
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		System.out.println("After sorting output will be: ");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}


}
