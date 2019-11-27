package Interface;
import java.util.Scanner;

//import .Student;
public class casestudy3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the address");
		String address=sc.next();
		System.out.println("Enter the contact number");
		int num=sc.nextInt();
		System.out.println("Enter the email id");
		String mail=sc.next();
		System.out.println("Enter the proof type");
		String ptype=sc.next();
		System.out.println("Enter the proof id");
			int pid=sc.nextInt();
			Student st=new Student();
			st.details(name,address,num,mail,ptype,pid);
			System.out.println("Thank you for registering.your id is 1...");
			System.out.println("Do you want to continue registration?(y/n)");
			String option=sc.next();
			String email;
			if(option.equals("no")==true || option.equals("yes")==true)
			{
				System.out.println("Do you want to update the email id(y/n)");
				String op=sc.next();
				if(op.equals("y")==true)
					{
					System.out.println("Update email");
					System.out.println("Enter new email id?");
					email=sc.next();
					mail=email;
					System.out.println("email id is updated");
					}
				System.out.println("your details are as follows");
				System.out.println("name:      "+name);
				System.out.println("address:    "+address);
				System.out.println("contact number:      "+num);
				System.out.println("Enter the proof id:        "+mail);
				System.out.println("proof type:         "+ptype);
				System.out.println("proof id:         "+pid);
			}

	}

		}
interface stud
			{
public void details(String name,String address,int num,String mail,String ptype,int pid);
			}

class Student implements stud
		{
public void details(String name,String address,int num,String mail,String ptype,int pid)
{
	System.out.println("name ->"+name);
	System.out.println("address ->"+address);
	System.out.println("contact number->"+num);
	System.out.println("Enter the email id-> "+mail);
		System.out.println("proof type->"+ptype);
		System.out.println("proof id ->"+pid);
}
}
