package ThreadLiveClassDemo;
class Booking implements Runnable
{
	int availabletickets=1;
	public synchronized void run()
	{
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(availabletickets==1)
		{
			System.out.println(name+" got the ticket");
			availabletickets=availabletickets-1;
			
		}
		else
		{
			System.out.println(name+" Sorry no  ticket");
		}
	}
	
}
public class BookingTask {
	public static void main(String[] args) {
		Booking b1=new Booking();
		Thread t1=new Thread(b1);
		Thread t2=new Thread(b1);
		Thread t3=new Thread(b1);
		
		t1.setName("raju");
		t2.setName("Anu");
		t3.setName("Abi");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
