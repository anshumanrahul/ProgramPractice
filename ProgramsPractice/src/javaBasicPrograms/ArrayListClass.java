package javaBasicPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {

	public static void main(String[] args) {
		
		
		ArrayList<String> fruits=new ArrayList<>();
		fruits.add("orange");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Grapes");
		
	    Collections.sort(fruits);
		for(int i=0;i<fruits.size();i++)
		{
		
		System.out.println(fruits.get(i));
		
		}
		
		

	}

}
