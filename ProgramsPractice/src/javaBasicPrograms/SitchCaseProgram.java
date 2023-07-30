package javaBasicPrograms;

public class SitchCaseProgram {

	public static void main(String[] args) {
		int num=2;
		switch(num)
		{
		case 0:
		System.out.println("Number is 0");
		case 1:
			System.out.println("Number is 1");
		case 2:
			System.out.println("Number is 2");
			break;
			default:
				System.out.println("The number is: " +num);
		}

	}

}
