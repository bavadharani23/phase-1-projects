package sorting;
import java.util.Scanner;
class Main
{
	void mergesort(int arr[],int lb,int ub)
	{
		if(lb<ub)
		{
			int mid=(lb+ub)/2;
			mergesort(arr,lb,mid);
			mergesort(arr,mid+1,ub);
			merge(arr,lb,mid,ub);
		}
	}
	void merge(int arr[],int lb,int mid,int ub)
	{
		int i=lb,j=mid+1,index=lb,k,size=1000;
		int temp[]=new int[size];
		while(i<=mid && j<=ub)
		{
			if(arr[i]<arr[j])
			{
				temp[index]=arr[i];
				i++;
			}
			else
			{
				temp[index]=arr[j];
				j++;
			}
			index++;
		}
		if(i>mid)
		{
			while(j<=ub)
			{
				temp[index]=arr[j];
				index++;
				j++;
			}
		}
		else
		{
			while(i<=mid)
			{
				temp[index]=arr[i];
				index++;
				i++;
			}
		}
		k=lb;
		while(k<index)
		{
			arr[k]=temp[k];
			k++;
		}
		
		
	}
}
public class Mergesort {
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
		Main ob = new Main();
		ob.mergesort(arr, 0, size-1);
		System.out.println("After sorting output will be: ");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
