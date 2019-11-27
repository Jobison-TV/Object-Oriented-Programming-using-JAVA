package inheritance1;
import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      System.out.println("ENTER THE FILM NAME");
      String n=s.nextLine();
      System.out.println("ENTER THE DIRECTOR NAME");
      String n1=s.nextLine();
      Film1 d=new Film1();
      d.name(n);
      d.director(n1);
      d.about();
     
      s.close();
	}

}
class Film {
	public void about() {
		System.out.println("SUPER HIT");
	}
}
 class Film1 extends Film 
{
	public void name(String n) {
		System.out.println(n);}
	public void director(String n1) {
		System.out.println(n1);}
	
}
