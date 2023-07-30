package javaBasicPrograms;

import java.util.ArrayList;
import java.util.List;

public class ForEachOrderedProgram {

	public static void main(String[] args) {
		List<String> games=new ArrayList<String>();
		games.add("Cricket");
		games.add("Football");
		System.out.println("*****************Iterate through Lambada Expression**********");
		
		games.stream().forEachOrdered(gameslist -> System.out.println(gameslist));
		
		System.out.println("************Iterate through method reference**********");
		games.stream().forEachOrdered(System.out::println);
	}

}
