package javainterfacesandcollections;
import java.util.*;
public class ValidationOfEmailId {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of MailId's: ");
		int size =sc.nextInt();
		System.out.println("Enter the MailId's");
		ArrayList<String> email=new ArrayList<String>(); 
		for(int i=1;i<=size;i++)
		{  
	        email.add(sc.next());  
	    }  
		
		System.out.println("Enter the SearchId");
		String searchid=sc.next();
		if(email.contains(searchid))
        {
            System.out.println(searchid+" is found.");    
        }
        else
        {
            System.out.println(searchid+" is not found.");
        }	
	}
}
