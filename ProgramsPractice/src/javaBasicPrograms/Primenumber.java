package javaBasicPrograms;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int n=s.nextInt();
		System.out.println(n);
		int flag=0;
		int m=0;
		m=n/2;
		
		 if(n==0||n==1){
		{
			System.out.println("Number is not prime");
		}
		 }
		else
		{
			for(int i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println("Number is not prime");
					
					flag=1;
					break;
				}
				else
				{
					if(flag==0)
					{
					System.out.println("Number is prime");
				}
				}
			}
	
		
	}
	
		 }
}

	
