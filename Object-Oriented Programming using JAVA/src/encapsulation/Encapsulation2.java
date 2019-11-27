package encapsulation;
import java.util.Scanner;
public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
Customer c=new Customer();
System.out.println("enter the name");
c.setName(s.next());
System.out.println("enter the address");
c.setAddress(s.next());
System.out.println("enter the contact");
c.setContactNumber(s.next());
System.out.println("enter the email");
c.setEmail(s.next());
System.out.println("enter the proof Type");
c.setProofType(s.next());
System.out.println("enter the proof ID");
c.setProofID(s.next());
//c.Register(c.getName(),c.getAddress(),c.getContactNumber(),c.getEmail(),c.getProofType(),c.getProofID());
Display d=new Display();
d.display1(c.getName(),c.getAddress(),c.getContactNumber(),c.getEmail(),c.getProofType(),c.getProofID());

	}

}
