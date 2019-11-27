package Classandmethods;

import java.util.Scanner;

public class palindromestring {

	public static void main(String[] args) {
		
		System.out.println("Enter a string:");
		 String  rev = "";
		      Scanner s=new Scanner(System.in);
		 
		     String str=s.nextLine();
		 
		      int length=str.length();
		 
		      for ( int i=length-1;i>=0;i--)
		         rev = rev + str.charAt(i);
		 
		      if (str.equals(rev))
		         System.out.println("palindrome");
		      else
		         System.out.println(" not a palindrome");
		 
			}


}
