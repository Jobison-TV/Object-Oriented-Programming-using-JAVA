package polymorphism1;
//import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example4 ex=new Example4();
ex.display();
Data d=new Data();
d.display();

	}
}

class Data{
	void display()
	{
	System.out.println("PARENT CLASS");
}}
class Example4 extends Data
{
	void display() {
		// TODO Auto-generated method stub
		System.out.println("CHILD CLASS");
	}

}