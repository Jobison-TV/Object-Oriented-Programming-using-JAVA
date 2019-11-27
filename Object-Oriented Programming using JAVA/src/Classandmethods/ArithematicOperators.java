package Classandmethods;
import java.util.Scanner;
public class ArithematicOperators {





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the numbers");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("1)add\n2)sub\n3)mul\n");
		int n=s.nextInt();
		Op c = new Op(a,b);
		switch(n)
		{
		case 1:
			Op.add(a,b);
			break;
		case 2:
			Op.sub(a,b);
			break;
		case 3 :
			Op.mul(a,b);
			break;
		//Carnew.a();
		}}
}
class Op{
	int a,b;
	public Op(int a,int b) {
		a=a;
		b=b;
		
	}
	public static void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.printf("MUL->%d",a*b);
		
	}



	public static void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.printf("SUB->%d",a-b);
		
	}



	public static void add(int a, int b) {
		
		// TODO Auto-generated method stub
		System.out.printf("ADD->%d",a+b);
		
		
	}


	public static void disply(int a) {
		// TODO Auto-generated method stub
		
	}
	}

