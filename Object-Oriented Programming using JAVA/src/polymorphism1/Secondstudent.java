package polymorphism1;
import java.util.Scanner;
public class Secondstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the name");
String name=s.next();
System.out.println("enter the rollno");
int rno=s.nextInt();
System.out.println("enter the name of dept.");
String dept=s.next();
System.out.println("enter the year");
int year=s.nextInt();
System.out.println("enter the mark in maths");
int m=s.nextInt();
System.out.println("enter the mark in english");
int e=s.nextInt();
System.out.println("enter the mark in physics");
int p=s.nextInt();
System.out.println("enter the mark in chemistry");
int c=s.nextInt();
System.out.println("enter the mark in malayalam");
int ma=s.nextInt();
Sum ss=new Sum();
ss.display(name,rno,dept,year,m,e,p,c,ma);
int n=ss.display(m,e,c,p,ma);
System.out.printf("SUM=%d\n",n);
ss.display(n);

	}

}
