package MultiThread;

class C extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				System.out.println("Thread going to sleep "+i+" times");
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("Thread running "+i+" times");
			System.out.println(i);
		}
	}
}
public class Thread_Sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C t=new C();
		t.start();

	}

}
