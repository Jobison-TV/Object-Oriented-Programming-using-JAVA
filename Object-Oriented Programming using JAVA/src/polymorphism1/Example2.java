package polymorphism1;
//import java.util.Scanner;
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example3 ex=new Example3();
ex.display();

	}
}

class Data1{
	void display()
	{
	System.out.println("PARENT CLASS");
}}
class Example3 extends Data
{
	void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("CHILD CLASS");
	}

}