package stringProgram;

public class NumberofOccurence 
{
		public static void main(String[] args)
		{
			
			String s = "adab";
			int count = 0;
			
			for (int i=0; i<s.length(); i++)
			{
				if (s.charAt(i)=='a')// to count the occurrance of character 'a' in the string
				{
					count = count +1;
				}
				
			}
			
			System.out.println("The character a is available for "+count+ " times");
			
			
	}

		
}
	

