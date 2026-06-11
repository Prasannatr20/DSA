package number;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int year=sc.nextInt();
		if(year%4 ==0)
		{
			if(year%100!=0)
			{
				System.out.println("leap");
				return;
			}
			if(year %400==0)
			{
				System.out.println("leap");
			}
			else
			{
				System.out.println("non");
			}
		}
		else
		{
			System.out.println("non");
		}
	}

}
