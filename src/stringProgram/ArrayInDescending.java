package stringProgram;

public class ArrayInDescending
{
	public static void main(String[] args)
	{
		int [] a=new int [5];
		
		a[0]=800;//i=0
		a[1]=50;// j=1 2 i
		a[2]=55;//
		a[3]=90;
		a[4]=200;
					
		for(int i=0;i<=4;i++)
		{
			for(int j=i+1;j<=4;j++)
			{
				//comparison of two elements 
				if(a[i]<a[j])
				{
					//element are swapped if the current element is smaller than
					//the the next element
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		
		System.out.println("Array in descending order");
		for(int i=0;i<=4;i++)
			System.out.println(a[i]);
		
		//for(int d:a)
		//System.out.println(d);
	}
}
