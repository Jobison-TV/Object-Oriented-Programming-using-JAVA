package encapsulation;

public class Display  {

	int i=1;
	public void display1(String name, String address, String contactNumber, String email, String proofType,
			String proofID) {
		// TODO Auto-generated method stub
		System.out.println("REGISTRATION");
		System.out.println("name="+name);
		
		System.out.println("address="+address);
		
		System.out.println("contact="+contactNumber);
		
		System.out.println("email="+email);
		System.out.println("prooftype="+proofType);
		System.out.println("proofid="+proofID);
		System.out.printf("Thank you for registering your id is %d.....",i);
		i++;
		
	}
}

	
	