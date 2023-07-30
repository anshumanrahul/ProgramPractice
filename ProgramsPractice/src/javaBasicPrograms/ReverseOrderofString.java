package javaBasicPrograms;

public class ReverseOrderofString {

	public static void main(String[] args) {
		String a="My Name IS Rahul";
		String[] temp=a.split(" ");
		String rev="";
		for(int i=temp.length-1;i>=0;i--) {
			
			rev=rev+temp[i]+" ";		
			
		}
		System.out.println(rev.substring(0,rev.length()-1));
		

	}

}
