package math;

import java.util.ArrayList;
import java.util.Collections;

public class PrintAllDivisors {

	public static void main(String[] args)
	{
		System.out.println(divisor(36));
	}
	//BruteForce
//	static ArrayList<Integer> divisor(int n)
//	{
//		ArrayList<Integer> list = new ArrayList<>();
//		for(int i=1;i<=n;i++)
//		{
//			if(n%i==0) list.add(i);
//		}
//		return list;
//	}
	static ArrayList<Integer> divisor(int n)
	{
		ArrayList<Integer> list= new ArrayList<>();
		for(int i=1;i*i<=n;i++)
		{
			if(n%i==0)
			{
				if(i*i==n) list.add(i);
				else
				{
					list.add(i);
					list.add(n/i);
				}
			}
		}
		Collections.sort(list);
		return list;
	}
}