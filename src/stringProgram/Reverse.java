package stringProgram;

public class Reverse 
{
	 public static void main(String[] args) {
			String s = "abc";
			String rev="";
			
			for (int i=(s.length()-1); i>=0; i--)
			{
				rev=rev+s.charAt(i);
				
			}
			System.out.println("The reversed String is "+rev);
			System.out.println(s);
			
			if(s.equalsIgnoreCase(rev))
			{
				System.out.println("string is palindrome");
			}
			else
				System.out.println("string is not palindrome");
	 }

}
