package Classandmethods;
import java.util.Scanner;
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter the name");
		String str=s.next();
		Carnew c = new Carnew(str);
		Carnew.a();

		Carnew.b();

		Carnew.m();
		Carnew.disply(str);



	}

}
class Carnew{
	String str;
	public Carnew(String str) {
		str=str;
	}
	
	public static void m() {
		// TODO Auto-generated method stub
		System.out.println("welcome car m");
		System.out.println("welcome car model 123");
		
	}
	public static void b() {
		// TODO Auto-generated method stub
		System.out.println("welcome car b");
		System.out.println("welcome car model 123");
		
		
	}
	public static void a() {
		// TODO Auto-generated method stub
		System.out.println("welcome car a");
		System.out.println("welcome car model 123");
		
	}
		public static void disply(String str) {
			// TODO Auto-generated method stub
			System.out.println(str);
			
			
			
		}
	}

