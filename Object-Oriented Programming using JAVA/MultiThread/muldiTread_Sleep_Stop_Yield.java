package MultiThread;
class Car extends Thread{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			if(i==1) yield();
			
			
			System.out.println("car running "+i+" position");
		}
			System.out.println("complete");
			}
	}

	class Car1 extends Thread
	{ 
		public void run()
		{
			for(int i=1;i<5;i++)
			{
				if(i==2) stop();
				{
					
				}
				System.out.println("car b complete");
			}
		
	}
}
	class Car2 extends Thread
	{
		public void run()
		{
			for(int i=1;i<5;i++)
			{
				if(i==3)
				{
					try {
						System.out.println("car running sleep");
						Thread.sleep(100000);
						
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		}
	}

public class muldiTread_Sleep_Stop_Yield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c=new Car();
		Car1 c1=new Car1();
		Car2 c2=new Car2();
		
		c.start();
		c1.start();
		c2.start();
	}

}
