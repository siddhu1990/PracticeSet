package stringProgram;

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args) 
	{
		boolean flag = true;
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter number -> ");
		//int n = sc.nextInt();
		int n=6;
		for(int i=2;i<n;i++){
			int rem = n%i;
			if(rem==0){
			flag = false;
				
			break;
			}
		}
			if(flag) System.out.println("PrimeNumber");
			else System.out.println("Not PrimeNumber");
	}
}
