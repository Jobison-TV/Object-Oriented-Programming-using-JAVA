package inheritance1;


import java.util.Scanner;

class Main {
	 public static void main(String args[])
	  {
	   
		 Scanner s=new Scanner(System.in);
		    String name=s.next();
	      int age=s.nextInt();
		     String gender=s.next();
		   int id=s.nextInt();
		    String major=s.next();
		     double cgpa=s.nextDouble();
		    int year=s.nextInt();
	    dis sc=new dis();
	    sc.details();
      sc.dis(name,age,gender,id,major,cgpa,year);
	  }}
class student{
	  public void details() {
		 
	    System.out.println("Name");
	    
	    System.out.println("Age");
	    System.out.println("Gender");
         System.out.println("ID Number");
	    System.out.println("Major");
	    System.out.println("CGPA");
	    System.out.println("Year");
     }}
class dis extends student{
 public void dis(String name,int age,String gender,int id,String major,double cgpa,int year){
   
	    
	     System.out.println("The Student details is");

	    System.out.println("ID : " + id);
	    System.out.println("Name : " + name);
	    
	    System.out.println("Age : " + age);
	    System.out.println("Gender : "+ gender);
	    System.out.println("Major : " + major);
	    System.out.println("CGPA : " + cgpa);
	    System.out.println("Year : " + year);
	    
	  }
	}

