package javaBasicPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n;
		n = s.nextInt();
		int r;

		int sum = 0;
		int temp;

		temp = n;

		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println("Number is Palidrome");
		} else {
			System.out.println("Number is not Palindrame");
		}
	}

}
