package javaBasicPrograms;

public class ForeachLoopProgram {

	public static void main(String[] args) {
		String[] names={"rahul","Shilpa","Arsh","Arya"};
		
		System.out.println("Printing the name of family members");
		for(String name:names)
		{
			System.out.println(name);
		}

	}

}
