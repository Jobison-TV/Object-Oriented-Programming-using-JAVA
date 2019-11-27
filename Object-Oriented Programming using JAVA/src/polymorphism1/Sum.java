package polymorphism1;
import java.util.Scanner;
public class Sum {

	public void display(int n) {
		// TODO Auto-generated method stub
		int avg=n/5;
		System.out.printf("AVERAGE=%d\n",avg);
		if(n>=350)
			System.out.println("RANK 1");
		else if(n>=300)
			System.out.println("RANK 2");
		else if(n>=250)
			System.out.println("RANK 3");
		else if(n>=200)
			System.out.println("RANK 4");
		else
			System.out.println("FAILED");
		
		
	}

	public void display(String name, int rno, String dept, int year, int m, int e, int p, int c, int ma) {
		// TODO Auto-generated method stubSystem.out.println("NAME:"+name);
		System.out.println("NAME:"+name);
		System.out.println("ROLLNO:"+rno);
		System.out.println("DEPT:"+dept);
		System.out.println("YEAR:"+year);
		System.out.println("MARK IN MATHS:"+m);
		System.out.println("MARK IN ENGLISH:"+e);
		System.out.println("MARK IN PHYSICS:"+p);
		System.out.println("MARK IN CHEMISTRY:"+c);// TODO Auto-generated method stub
		System.out.println("MARK IN MALAYALAM:"+ma);
		
	}

	public int display(int m, int e, int c, int p, int ma) {
		// TODO Auto-generated method stub
		int sum1=m+e+ma+p+c;
		return sum1;
	
		
	}

	
}
