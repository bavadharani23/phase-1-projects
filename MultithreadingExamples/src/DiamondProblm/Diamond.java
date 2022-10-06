package DiamondProblm;
interface Gold 
{  
    default void show() 
    { 
        System.out.println("Gold"); 
    } 
} 
interface Silver 
{  
    default void show() 
    { 
        System.out.println("Silver"); 
    } 
}  

public class Diamond implements Gold,Silver {
    public void show() 
    {  
        Gold.super.show(); 
        Silver.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        Diamond ob = new Diamond(); 
        ob.show(); 
    } 


}
