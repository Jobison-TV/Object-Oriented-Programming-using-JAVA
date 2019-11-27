package MultiThread;

import java.util.Scanner;

public class Own {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T c=new T();
		c.start();

	}

}
class T extends Thread
{ 
	Scanner s=new Scanner(System.in);
String str1=s.nextLine();
	//String Str="WELCOME";
	char ch[]=str1.toCharArray();
	
	public void run()
	{
		for(int i=0;i<str1.length();i++)
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
