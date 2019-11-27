package Classandmethods;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		 int r,rev=0,temp;
		 temp=n;    
		  while(n>0){    
		   r=n%10;  
		   rev=(rev*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==rev)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		
		
	}

}
