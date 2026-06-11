package array;

import java.util.Scanner;

public class InputSumprime
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(sum(arr));
	}
	static int sum(int[] arr)
	{
		int sum=0;
		for(int i: arr)
		{
			if(prime(i))
			{
				sum+=i;
			}
		}
		if(sum==0) return 0;
		return sum;
	}
	static boolean prime(int n)
	{
		if(n<=1) return false;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
