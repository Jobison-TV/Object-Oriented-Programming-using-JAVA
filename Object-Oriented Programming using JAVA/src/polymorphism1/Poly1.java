package polymorphism1;
import java.util.Scanner;
public class Poly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number1");
int n1=s.nextInt();
System.out.println("Enter the number2");
int n2=s.nextInt();
System.out.println("Enter the number3");
int n3=s.nextInt();
Add a=new Add();
a.add(n1);
a.add(n1,n2);
a.add(n1,n2,n3);



	}

}
class Add
{

	public void add(int n1) {
	System.out.printf("sum1=%d\n",n1);
		
	}

	public void add(int n1, int n2) {
		// TODO Auto-generated method stub
		System.out.printf("sum2=%d\n",n1+n2);
		
	}

	public void add(int n1, int n2,int n3) {
		System.out.printf("sum3=%d",n1+n2+n3);
		
	}
	
}