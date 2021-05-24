package stringProgram;

public class FibonacciSeries 
{
	public static void main(String[] args)
	{
		int prev,next,sum=0;	
		prev=next=1;
		System.out.print(prev+" ");
		for(int i=1;i<10;i++)//2//3
		{
			sum = prev + next;//2//3//5
			System.out.print(sum+" ");
			prev= next;//1//2//3
			next = sum;//2//3//5
		}
	}	
}
