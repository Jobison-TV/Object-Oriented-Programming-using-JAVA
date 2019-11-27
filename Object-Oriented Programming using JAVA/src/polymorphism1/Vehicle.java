package polymorphism1;

import java.util.Scanner;

public class Vehicle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("1.Car\n2.Bike");
		   System.out.println("Enter the choice");
		   int n=sc.nextInt();
		Vehicles f=new Vehicles();
		   switch(n)
		   {
		     case 1:
		     System.out.println("Enter the details of car");
		     System.out.println("Enter the name of the car");
		   String b=sc.next();
		   System.out.println("Enter the colour of the car");
		   String b1=sc.next();
		   System.out.println("Enter the max speed of the car");
		   String b2=sc.next();
		   System.out.println("Enter the number of seat ");
		   String b3=sc.next();
		   System.out.println("Enter the number of wheelsr");
		   String b4=sc.next();
		   
		    f. details(b,b1,b2,b3,b4);
		    System.out.println("Enter the status of disc break(true/false");
			   String b5=sc.next();
		     break;
		     
		     case 2:
		     System.out.println("Enter the details of bike");
		  
		   System.out.println("Enter the name of the bike");
		    String j=sc.next();
		    System.out.println("Enter the colour of the car");
			   String j1=sc.next();
			   System.out.println("Enter the max speed of the car");
			   String j2=sc.next();
			   System.out.println("Enter the number of seat ");
			   String j3=sc.next();
			   System.out.println("Enter the number of wheelsr");
			   String j4=sc.next();
			   System.out.println("Enter the status of disc break(true/false");
			   String j5=sc.next();
		     f.Vehicle(j,j1,j2,j3,j4,j5);
		     break;
		    
		     default:System.out.println("Invalid");
		     break;
		   }
		 }
}
	