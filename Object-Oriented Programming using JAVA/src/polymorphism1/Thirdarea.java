package polymorphism1;
import java.util.Scanner;
public class Thirdarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
double pi=3.14;
System.out.println("enter the length of rectangle");
int l=s.nextInt();
System.out.println("enter the breadth of rectangle");
int b=s.nextInt();
System.out.println("enter the side of square");
int a=s.nextInt();
System.out.println("enter the radius");
int r=s.nextInt();
Area a1=new Area();
a1.area(l,b);
a1.area(a);
a1.area(r,pi);
a1.peri(l,b);
a1.peri(r,pi);
a1.peri(a);

	}

}
class Area{

	public void area(int l, int b) {
		int area=0;
		area=l*b;
		System.out.printf("AREA OF RECTANGLE %d\n",area);
		
		
	}

	public void peri(int a) {
		int peri=0;
		peri=4*a;
		System.out.printf("PERIMETER OF SQUARE %d\n",peri);
		
	}

	public void peri(int r, double pi) {
		// TODO Auto-generated method stub
		double peri=0;
		peri=2*pi*r*r;
		System.out.printf("PERIMETER OF CIRCLE %.1f\n",peri);
		
	}

	public void peri(int l, int b) {
		// TODO Auto-generated method stub
		int peri=0;
		peri=2*(l+b);
		System.out.printf("PERIMETER OF RECTAGLE %d\n",peri);
		
	}

	public void area(int r, double pi) {
		// TODO Auto-generated method stub
		double area=0;
		area=pi*r*r;
		System.out.printf("AREA OF CIRCLE %.1f\n",area);
		
	}

	public void area(int a) {
		// TODO Auto-generated method stub
		int area=0;
		area=a*a;
		System.out.printf("AREA OF SQUARE %d\n",area);
	}
	
}