package Abstrat;

import java.util.Scanner;

public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the name:");
		 String name=sc.next();
		 System.out.println("Enter the id:");
		 int id=sc.nextInt();
		 System.out.println("Enter mark of \n1.maths\n2.physics\n");
		 int mark1=sc.nextInt();
		 int mark2=sc.nextInt();
		 int total=0;
		 total=mark1+mark2;
		Student s=new Student();
		s.totalmark(name,id,mark1,mark2,total);
		

	}
}
abstract class rank{
	abstract void totalmark(String name,int id,int mar1,int mark2,int total);
	public void rank1() {
		
		System.out.println("rank1");
		
	}
	public void rank2() {
		System.out.println("rank2");
	}
}
class Student extends rank{
	void totalmark(String name, int id, int mark1, int mark2, int total) {
		System.out.println("name->"+name);
		System.out.println("id->>"+id);
		
		System.out.println("total mark->>>"+total);
		if(total<500&&total>450) {
		super.rank1();
	}
		else
			{
			super.rank2();
			}
			}

}