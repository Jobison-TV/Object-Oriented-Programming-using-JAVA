package encapsulation;
import java.util.Scanner;
public class Customer1 {
	int n;
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	int i=1;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public String getName() {
		return name;
	}
	public boolean setName(String name)
    {
        if (name.matches("^[a-zA-Z]*$"))
        {
            this.name=name;
            return true;
        }
        else
        {
           // System.out.println("Invalid name");
            return false;
        }
    
	}
	public String getAddress() {
		return address;
	}
	public boolean setAddress(String address)
    {
        if (address.matches("^[a-z]*$"))
        {
            this.address=address;
            return true;
        }
        else
        {
            //System.out.println("Invalid Address");
            return false;
        }
    }
	
	public String getContactNumber() {
		return contactNumber;
	}
	public boolean setContactNumber(String contact)
    {
        if (contact.matches("^[0-9]*$"))
        {
            this.contactNumber=contact;
            return true;
        }
        else
        {
           // System.out.println("Invalid Contact Number");
            return false;
        }
    }
	
	public String getEmail() {
		return email;
	}
	public boolean setEmail(String email)
    {
        if (email.contains("@"))
        {
            this.email=email;
            return true;
        }
        else
        {
           // System.out.println("Invalid Email");
            return false;
        }
    }
	
	public String getProofType() {
		return proofType;
	}
	public boolean setProofType(String prooftype)
    {
        if (prooftype.matches("^[a-zA-Z]*$"))
        {
            this.proofType=prooftype;
            return true;
        }
        else
        {
            //System.out.println("Invalid proof type");
            return false;
        }
    
	}
	public String getProofID() {
		return proofID;
	}
	public boolean setProofID(String proofid)
    {
        if (proofid.matches("^[0-9a-zA-Z]*$"))
        {
            this.proofID=proofid;
            return true;
        }
        else
        {
            //System.out.println("Invalid proof id");
            return false;
        }
    
	}
	void Register(String name, String address, String contactNumber, String email, String proofType,String proofID)
	{
		System.out.println("REGISTRATION");
		System.out.println("name="+name);
		System.out.println("address="+address);
		System.out.println("contact="+contactNumber);
		System.out.println("email="+email);
		System.out.println("prooftype="+proofType);
		System.out.println("proofid="+proofID);
		System.out.printf("Thank you for registering your id is %d.....",i);
		i++;
}}


