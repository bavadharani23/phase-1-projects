package implementsEg;
class Multi extends Thread
{
	public void run()
	{
		System.out.println("Thread is running");
	}
	
}
public class ThreadEg {
	public static void main(String[] args) {
		Multi obj=new Multi();
		obj.start();
	}


}
