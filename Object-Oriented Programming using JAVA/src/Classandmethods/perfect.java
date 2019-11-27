package Classandmethods;

import java.util.Scanner;

public class perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int sum=0;
		 for(int i=1;i<n;i++)
		 {
			 if(n%i==0) {
				 sum=sum+i;
			 }
			 
			 }
		 if(sum==n) {
			 System.out.print("perfect number");
		 }
		 else
			 System.out.print("not perfect number");
		 }

	}


