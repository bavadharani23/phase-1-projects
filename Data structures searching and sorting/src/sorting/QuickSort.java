package sorting;
import java.util.Scanner;
class Example
{
	static int partition(int arr[],int lb,int ub)
	{
	    int pivot,start,end,temp;
	    pivot=arr[lb];
	    start=lb;
	    end=ub;
	    while(start<end)
	    {
	        while(arr[start]<=pivot)
	        {
	            start++;
	        }
	        while(arr[end]>pivot)
	        {
	            end--;
	        }
	        if(start<end)
	        {
	            temp=arr[start];
	            arr[start]=arr[end];
	            arr[end]=temp;
	            
	        }
	    }
	    temp=arr[lb];
	    arr[lb]=arr[end];
	    arr[end]=temp;
	    return end;
	    
	}
	static void quicksort(int arr[],int lb,int ub)
	{
	    if(lb<ub)
	    {
	        int loc;
	        loc=partition(arr,lb,ub);
	        quicksort(arr,lb,loc-1);
	        quicksort(arr,loc+1,ub);
	    }
	}
}
public class QuickSort {

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
		
		
		Example.quicksort(arr, 0, size-1);
		System.out.println("After sorting output will be: ");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
		

	}

}
