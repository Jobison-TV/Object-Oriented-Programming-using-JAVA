package inheritance1;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter film name");
        String str=s.nextLine();
        System.out.println("enter director name");
        String str1=s.nextLine();
        System.out.println("enter another film name");
        String str2=s.nextLine();
        Film2 f=new Film2();
        f.name(str);
        f.director(str1);
        f.about(str);
        f.second(str2);
        f.secondabout(str2);
	}

}
class Film4{
	void name(String str)
	{
		System.out.println(str);	
	}
	
}
class Film5 extends Film4{
	void director(String str1)
	{
		System.out.println(str1);
		}
		void about(String str)
		{
			System.out.printf("%s is a superhit movie\n",str);	
		}
		void secondabout(String str2)
		{
			System.out.printf("%s is a superhit movie\n",str2);	
		}
	
}
class Film2 extends Film5{

	void second(String str2)
	{
		System.out.println(str2);	
	}
	
}