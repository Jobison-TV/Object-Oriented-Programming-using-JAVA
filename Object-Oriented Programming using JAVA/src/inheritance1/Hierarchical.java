package inheritance1;
import java.util.Scanner;
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

Audi a=new Audi();
Toyota1 t=new Toyota1();
a.name();
a.model();
a.price();
t.name1();
t.model1();
t.price1();

	}

}
class Car9{
	Scanner s=new Scanner(System.in);
	void name()
	{
		System.out.println("ENTER THE CAR NAME");
		String str=s.next();
	}
	void name1()
	{
		System.out.println("ENTER THE CAR NAME");
		String str1=s.next();
	}
	
	
}
class Audi extends Car9
{
	void model() {
		System.out.println("MODEL:006");
	}
	void price() {
		System.out.println("PRICE:20000000");
	}
}
class Toyota1 extends Car9
{
	void model1() {
		System.out.println("MODEL:2020");
	}
	void price1() {
		System.out.println("PRICE:2020000");
	
}}