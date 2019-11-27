package inheritance1;
import java.util.Scanner;
public class Casestudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the number of person");
			int p=s.nextInt();
			System.out.println("Enter the number of days");
			int d=s.nextInt();
			System.out.println("Enter the room type");
			String str=s.next();
			System.out.println("Enter the tarriff for a single person");
			double ta=s.nextInt();
		
Seasonbook ss=new Seasonbook();

double total=ss.roombooking(p,d,ta);
System.out.printf("total Tariff:%.2f",total);
	}

}
class Booking{
	double roombooking(int p,int d,double ta)
	{
	double tot=(double)p*ta*d;
			return tot;
	}
	
}
class Seasonbook extends Booking{
	
}