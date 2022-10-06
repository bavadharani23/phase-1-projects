package search;
import java.util.Scanner;
public class Binarysearch {
	public static void main(String[] args) {
		int search,size,i,first,middle,last;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		size=sc.nextInt();
		System.out.println("Enter the element to be searched: ");
		search=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements: ");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		first=0;
		last=size-1;
		middle=(first+last)/2;
		while(first<=last)
		{
			if(arr[middle]<search)
			{
				first=middle+1;
			}
			else if(arr[middle]==search)
			{
				System.out.println("The element is present at index "+middle);
				break;
			}
			else
			{
				last=middle-1;
			}
			middle=(first+last)/2;
		}
		if(first>last)
		{
			System.out.println("The element is not present ");
		}
		
	}

}
