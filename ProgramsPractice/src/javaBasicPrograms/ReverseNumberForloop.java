package javaBasicPrograms;

public class ReverseNumberForloop {

	public static void main(String[] args) {
		int n=12345;
		int reverse=0;
		int m;
		for(;n!=0; n=n/10)
		{
			m=n%10;
			reverse=reverse*10+m;
			
		}
		System.out.println(reverse);
		

	}

}
