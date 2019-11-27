package polymorphism1;

import java.util.Scanner;

public class Fresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.Bread only");
		    System.out.println("2.Bread+Jam");
		    System.out.println("3.Bread+Jam+Butter");
		    System.out.println("Enter the choice");
				Scanner s=new Scanner(System.in);
				
				int kj=74,cb=102,cj=26;
				int n=s.nextInt();
		   double ca=4.1868;
		   Bread a=new Bread();
		     switch(n) {
		     case 1:
		         System.out.println("Enter slice of bread");
		         int b=s.nextInt();
		          a. calculateCalories(b);
		           break;
		           
		           case 2:
		           System.out.println("Enter slice of bread");
		         int b1=s.nextInt();
		         System.out.println("Enter number of spoon of jam");
		          int j1=s.nextInt();
		           a.calculateCalories(b1,j1);
		           break;
		           
		           case 3:
		           System.out.println("Enter slice of bread");
		         int b2=s.nextInt();
		           System.out.println("Enter number of spoon of butter");
		      int bu=s.nextInt();
		       System.out.println("Enter number of spoon of jam");
		          int j=s.nextInt();
		           a.calculateCalories(b2,j,bu);

		           break;
		           default:System.out.println("Invalid");
		           break;
		         }

		}
}