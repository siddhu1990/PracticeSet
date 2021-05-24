package stringProgram;

public class ReverseStringByWords
{
	public static void main(String[] args)
	{
		String s="Life is beautiful";
		String[] parts=s.split(" ");
		for(int i=parts.length-1;i>=0;i--)
		 System.out.print(parts[i]+" ");
				
	}	
}
