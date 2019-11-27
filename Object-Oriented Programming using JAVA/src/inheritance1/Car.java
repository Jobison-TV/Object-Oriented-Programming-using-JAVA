package inheritance1;
import java.util.Scanner;
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      System.out.println("enter car speed");
      int n=s.nextInt();
      Toyota d=new Toyota();
      d.name();
      d.about();
      d.speed(n);
      s.close();
	}

}
class car1 {
	public void about() {
		System.out.println("model is 202020");
	}
}
 class Toyota extends car1 
{
	public void name() {
		System.out.println("TOYOTA");}
	public void speed(int n) {
		System.out.println(n);}
	
}
