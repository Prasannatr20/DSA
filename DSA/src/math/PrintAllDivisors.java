package math;

import java.util.ArrayList;

public class PrintAllDivisors {

	public static void main(String[] args)
	{
		System.out.println(divisor(36));
	}
	static ArrayList<Integer> divisor(int n)
	{
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0) list.add(i);
		}
		return list;
	}
}