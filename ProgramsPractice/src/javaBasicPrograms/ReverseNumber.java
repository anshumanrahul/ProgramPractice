package javaBasicPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=12345;
		int temp;
		int sum=0;
		int remainder;
		
		while(n!=0)
		{
			remainder=n%10;
			sum=(sum*10)+remainder;
			n=n/10;
			
		}
		System.out.println(sum);

	}

}
