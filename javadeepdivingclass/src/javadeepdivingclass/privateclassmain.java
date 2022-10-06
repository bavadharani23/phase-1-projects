package javadeepdivingclass;

public class privateclassmain {
	
	public static void main(String args[])
	 {  
	   privateclass obj=new privateclass();  
	   System.out.println(obj.data);//Compile Time Error  
	   obj.msg();//Compile Time Error  
	 }  

}
