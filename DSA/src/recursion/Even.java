package recursion;

import java.util.Scanner;

public class Even 
{
	static void even(int n, int end)
	{
		
		if(n>end)//Base
		{
			return;
		}
		if(n%2==0)
		{
			System.out.println(n);
		}
		even(n+1, end);//Recursive
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		int end=num+100;
		if(num%2!=0)
		{
			Even.even(num+1,end);
		}
		else
			Even.even(num,end);
//		int j=scan.nextInt();
//		if(j%2!=0)
//			j=j+1;
//		for(int i=j;i<=j+100;i+=2)
//		{
//				System.out.println(i);
//		}
	}

}
