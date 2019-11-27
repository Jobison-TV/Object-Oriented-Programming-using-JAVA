package Classandmethods;


import java.util.Scanner;
class Main{
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
    String address;
      String contactnumber;
    String email;
    String prooftype;
    String proofId;
   // int Id=0;
    System.out.println("Registration");
		Scanner s=new Scanner(System.in);
    System.out.println("Enter your name");
		name =s.nextLine();
    System.out.println("Enter your address");
		address =s.nextLine();
    System.out.println("Contact Number");
    
		
		contactnumber =s.nextLine();
    System.out.println("E-Mail ID");
    email=s.nextLine();
     System.out.println("Enter proof type");
    prooftype=s.nextLine();
     System.out.println("Enter proof id");
    proofId=s.nextLine();
    customer c= new customer(name,address,contactnumber,email,prooftype,proofId);
                             c.register(name,address,contactnumber,email,prooftype,proofId);
  }}
class customer{
  String name;
  String address;
  String contactnumber;
  String email;
  String prooftype;
  String proofId;
  int id1=0;
  customer(String name,String address,String contactnumber,String email,String prooftype,String proofId){
    this.name=name;
    this.address=address;
    this.contactnumber=contactnumber;
    this.email=email;
    this.prooftype=prooftype;
    this.proofId=proofId;
    //this.id1=id1;
    
  }
  void register(String name,String address,String contactnumber ,String email,String prooftype,String proofid)
  {
int id=0;
    
    for(int i=1;i>=i;i++)
     //int id1=i;
      i++;
    System.out.println("Customer Details");
    System.out.println(this.name);
     System.out.println(this.address);
     System.out.println(this.contactnumber);
     System.out.println(this.email);
     System.out.println(this.prooftype);
     System.out.println(this.proofId);
     int i = 0;
	System.out.printf("Thank you for registering. Your id is",i++);
  }}