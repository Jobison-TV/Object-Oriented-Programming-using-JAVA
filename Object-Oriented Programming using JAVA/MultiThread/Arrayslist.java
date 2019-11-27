package MultiThread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Arrayslist {

	public static void main(String[] args) {
		int n,i,age;
		
		String name;
      Scanner s=new Scanner(System.in);
	System.out.println("Enter size");
	 n=s.nextInt();
	ArrayList al=new ArrayList();
		Employe e[]=new Employe[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter name");
			name=s.next();
			System.out.println("Enter age:");
			age=s.nextInt();
			e[i]=new Employe();
			e[i].setAge(age);
			e[i].setName(name);
			al.add(e[i]);
			
			
			
		}
		Iterator<Employe> itr=al.iterator();
		while(itr.hasNext())
		{
			Employe e1=itr.next();
			System.out.println(e1.getName()+" "+e1.getAge());
		}
	}

}
