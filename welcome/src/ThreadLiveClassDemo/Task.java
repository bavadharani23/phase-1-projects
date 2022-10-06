package ThreadLiveClassDemo;

import java.rmi.AccessException;

class MultipleThreadSameTask implements Runnable
{
	public void run()
	{
		Thread tt=Thread.currentThread();
		String name=tt.getName();
		
	
		for(int i=0;i<10;i++) {
			try
			{
				System.out.println(name+"="+i);
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
		}
	}
		
}
public  class Task {
	public static void main(String[] args)
	{
		Thread tt=Thread.currentThread();// To know the current thread which is running
		MultipleThreadSameTask T = new MultipleThreadSameTask();
		Thread t1=new Thread(T);
		Thread t2=new Thread(T);
		Thread t3=new Thread(T);
		System.out.println(tt);
		t1.setName("First Thread");
		t2.setName("Second Thread");
		t3.setName("Third Thread");
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}


