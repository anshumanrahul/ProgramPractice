package javaBasicPrograms;

import java.util.ArrayList;
import java.util.List;

public class ForEachJava8 {

	public static void main(String[] args) {
		List<String> games=new ArrayList<String>();
		games.add("Cricket");
		games.add("Football");
		games.add("chess");
		System.out.println("*********************Iterating by passing Lambada Expression*****************");
		
games.forEach(gamelist->System.out.println(gamelist));
		
//System.out.println("*********************Iterating by Passing method Reference*****************");
//games.forEach(System.out::println);
	}

}
