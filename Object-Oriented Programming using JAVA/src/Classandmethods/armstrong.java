package Classandmethods;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		 int r,c=0;
		int temp=n;    
		
	    while(n>0)  
	    {  
	    r=n%10;  
	      
	     c=c+(r*r*r);
	     n=n/10;
	    }  
	    if(temp==c)  
	    System.out.println("armstrong number");   
	    else  
	        System.out.println("Not armstrong number");   
	  	}

}
