package stringProgram;

public class Reveerse 

{
	public static void main(String[] args)
	{
		int no = 742;
		int rem;
		int rev = 0;

		while (no != 0) {
			rem = no % 10;//2

			rev = rev * 10 + rem;

			no = no / 10;
		}
	System.out.println("Reversed = "+rev);  
}
}
