package encapsulation;
import java.util.Scanner;
public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
Student st=new Student();
System.out.println("ENTER THE NAME");
st.setName(s.next());
System.out.println("ENTER THE ID");
st.setId(s.nextInt());
System.out.println("ENTER THE MARK");
st.setMark(s.nextInt());
System.out.println("NAME:"+st.getName());
System.out.println("ID:"+st.getId());
System.out.println("MARK:"+st.getMark());
	}

}
