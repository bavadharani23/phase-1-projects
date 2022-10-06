package search;
import java.util.Scanner;
public class Linearsearch {
	public static void main(String[] args) {
		int search,i,a=0,size,j=0;
		Scanner sc = new Scanner(System.in);
		//To get the size of array elements from user
		System.out.println("Enter the size of array: ");
		size=sc.nextInt();
		//To get the search element from user
		System.out.println("Enter the element to be searched: ");
		search=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements: ");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			//if the array element is equal to search then execute the condition
			if(arr[i]==search)
			{
				/*Here we should stop the program if the element is found or-else even if the 
				 *  element is found the loop will continue till the end of array elements so 
				 *  we are assigning a value of 1*/
				a=1;
				// i value will hold the position of the element to be searched
				j=i;
			}
		}
		// if the value of a is equal to 1 then it is true or-else the false part will get executed.
		if(a==1)
		{
			System.out.println("Element found at position "+j+" and the search element is "+search);
		}
		else
		{
			System.out.println("The element is not found");
		}
		
	}

}
