package Interface;

import java.util.Scanner;

public class fr {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		   
		    System.out.println("1.Current Account\n2.Savings Account");
		  
		    int ch=sc.nextInt();
		    String name=sc.next();
		    int accno=sc.nextInt();
		    int accbal=sc.nextInt();
		    int startdate=sc.nextInt();
		    int year=sc.nextInt();
		     Account ob=new Account
		    switch(ch)
		    {
		      case 1:
		      ob.current(name,accno,accbal,startdate,year);
		      break;
		      case 2:
		     ob.savings(name,accno,accbal,startdate,year);
		      break;
		      default :System.out.println("Invalid");
		      break;
		    }}

			    interface Details{
			      public void current(String name,int accno,int accbal,int startdate,int year);
			       public void savings(String name,int accno,int accbal,int startdate,int year);
			    }
			      class Account implements  Details,saving
			       {
			       public void current(String name,int accno,int accbal,int startdate,int year)
			       {
			         System.out.println("Name");
			         System.out.println("Account Number");
			         System.out.println("Account Balance");
			         System.out.println("Enter the start Date(yyyy-mm-dd)");
			         System.out.println("Enter the years");
			         System.out.println("Maintainence charge for Current Account 400.00");
			       }
			       public void savings(String name,int accno,int accbal,int startdate,int year)
			       {
			         System.out.println("Name");
			         System.out.println("Account Number");
			         System.out.println("Account Balance");
			         System.out.println("Enter the start Date(yyyy-mm-dd)");
			         System.out.println("Enter the years");
			         System.out.println("Maintainence charge for savings Account 550.00");
			       
		    }  } }
		  

