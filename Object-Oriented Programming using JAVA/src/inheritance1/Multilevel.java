package inheritance1;
//import java.util.Scanner;
public class Multilevel {

	public static void main(String[] args) {
		Model m=new Model();
		m.name();
		m.model();
		m.about();
        
	}

}
class Name
{
	void name() {
	System.out.println("CAR NAME:AUDI");}
}
class About extends Name
{
	void about() {
	System.out.println("   SUPER CAR");
	}
}
class Model extends About
{
	void model() {
System.out.println("CAR MODEL:006");}	
}
