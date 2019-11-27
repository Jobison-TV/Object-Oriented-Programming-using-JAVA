package inheritance1;


import java.util.Scanner;
public class Frsh1 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the details of Sports Bike");
      System.out.println("Name of the bike :");
      String bn=s.next();
System.out.println("Color of the bike :");
       String bcl=s.next();
System.out.println("Capacity(cc) of the bike :");
       int bc=s.nextInt();
System.out.println("Speed of the bike :");
       int bs=s.nextInt();
System.out.println("Price of the bike :");
       int bp=s.nextInt();
System.out.println("Discount of the bike :");
       int bd=s.nextInt();
       
		 System.out.println("Enter the details of Scooter");
                   
System.out.println("Name of the Scooter");
       String sn=s.next();
                
System.out.println("Color of the Scooter :");
       String scl=s.next();
System.out.println("(CC) of the Scooter :");
       int scc=s.nextInt();
System.out.println("Speed of the Scooter :");
       int ss=s.nextInt();
System.out.println("Price of the Scooter :");
      int sp=s.nextInt();
System.out.println("Discount of the scooter :");
      int sd=s.nextInt();
System.out.println("Weight of the scooter :");
      int sw=s.nextInt();
      vehicle a=new vehicle();
      a.bike( bn, bcl, bc, bs,  bd);


 }}
class vehicle1{
	public void details() {
	
	    
     }}
class vehicle extends vehicle1{
 public void bike(String bn,String bcl,int bc,int bs,int bp){
	 
	 System.out.println(bn);
	    System.out.println(bcl);
	    System.out.println(bc);
         System.out.println(bs);
	    System.out.println(bp);
	   
	  }
	}
class scooter extends vehicle{
 public void dis(String name,int age,String gender,int id,String major,double cgpa,int year){
 }}