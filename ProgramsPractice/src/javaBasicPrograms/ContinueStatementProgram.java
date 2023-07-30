package javaBasicPrograms;

public class ContinueStatementProgram {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(i==4 && j==4)
				{
					continue;
			}
			System.out.println(i+ " " +j);
		}

	}

}
}
