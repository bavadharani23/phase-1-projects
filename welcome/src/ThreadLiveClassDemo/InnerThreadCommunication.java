package ThreadLiveClassDemo;
class Info implements Runnable {
	public synchronized void run()
	{
		Thread t=Thread.currentThread();
		String name=t.getName();
		for(int i=0;i<10;i++)
		{
			try {
				System.out.println(name+""+i);
				Thread.sleep(500);
				if(i==5 && name.equals("Raju")) {
					wait();
				}
				if(i==4 &&name.equals("Anu")) {
					notify();
					wait();
				}
			}catch(Exception e) {}
		}
	}
}
public class InnerThreadCommunication {
	public static void main(String[] args) {
		Info obj=new Info();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		Thread t3=new Thread(obj);
		t1.setName("raju");
		t2.setName("Anu");
		t3.setName("Abi");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
