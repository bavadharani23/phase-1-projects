package javainterfacesandcollections;
import java.util.Scanner;
public class Examplearray {
		public static void main(String[] args) {
			int size,i;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of array: ");
			size=sc.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter the array elements: ");
			for(i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("The elements of array are: ");
			for(i=0;i<size;i++)
			{
				System.out.println(arr[i]);
			}
			System.out.println("Example of 2D array: ");
			int[][] arr1= {
					        {1,2,3,4},
			                {5,6,7,8}
			                };
			System.out.println(+arr1[0][1]);
				
		}

	}

