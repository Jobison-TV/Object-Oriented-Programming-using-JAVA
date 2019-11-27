package encapsulation;

import java.util.Scanner;
public class Encapsulation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
Customer1 c1=new Customer1();
int c=1;
do {
System.out.println("enter the number of customers");
c1.setN(s.nextInt());
System.out.println("enter the name");
c1.setName(s.next());
System.out.println("enter the address");
c1.setAddress(s.next());
System.out.println("enter the contact");
c1.setContactNumber(s.next());
System.out.println("enter the email");
c1.setEmail(s.next());
System.out.println("enter the proof Type");
c1.setProofType(s.next());
System.out.println("enter the proof ID");
c1.setProofID(s.next());
if(c1.getName()!=null&&c1.getAddress()!=null&&c1.getContactNumber()!=null&&c1.getEmail()!=null&&c1.getProofType()!=null&&c1.getProofID()!=null)
{
	c=0;
	c1.Register(c1.getName(),c1.getAddress(),c1.getContactNumber(),c1.getEmail(),c1.getProofType(),c1.getProofID());
	
	}
else {
	System.out.println("invalid registration");
	if(c1.getName()==null)
		System.out.println("invalid name");
	if(c1.getAddress()==null)
		System.out.println("invalid address");
	if(c1.getContactNumber()==null)
		System.out.println("invalid contact");
	if(c1.getEmail()==null)
		System.out.println("invalid email");
	if(c1.getProofType()==null)
		System.out.println("invalid proof type");
	if(c1.getProofID()==null)
		System.out.println("invalid Proof id");
	c=1;}

//Display d=new Display();
//d.display1(c1.getName(),c1.getAddress(),c1.getContactNumber(),c1.getEmail(),c1.getProofType(),c1.getProofID());
}while(c!=0);
	}	}

