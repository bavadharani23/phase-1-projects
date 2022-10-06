package ThreadingExample;
class ThreadEg implements Runnable
{
	public void run()
	{
		System.out.println("thread is running");
	}
	
}
public class ThreadImplementsEg {
	public static void main(String[] args)
	{
		ThreadEg obj=new ThreadEg();
		Thread t1=new Thread(obj);
		t1.start();
	}

}
