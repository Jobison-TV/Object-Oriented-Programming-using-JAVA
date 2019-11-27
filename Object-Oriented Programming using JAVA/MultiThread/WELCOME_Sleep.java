package MultiThread;

public class WELCOME_Sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		W c=new W();
		c.start();

	}

}
class W extends Thread
{
	String Str="WELCOME";
	char ch[]=Str.toCharArray();
	
	public void run()
	{
		for(int i=0;i<Str.length();i++)
		{
				try {
					System.out.println(ch[i]);
					//System.out.println("if u want c next char plz wait :/");
					Thread.sleep(1000);
					
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				
			}
		}
	}
