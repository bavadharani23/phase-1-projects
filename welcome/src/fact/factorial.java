package fact;
import java.util.Scanner;


public class factorial {
		public static void main(String[] args) {
			int var,i;
			int f=1;
			Scanner sc=new Scanner(System.in);
			var=sc.nextInt();
			for(i=1;i<=var;i++)
			{
				f=f*i;
				
			}
			System.out.println("factorial of value: "+f);	
			
		}

	}
