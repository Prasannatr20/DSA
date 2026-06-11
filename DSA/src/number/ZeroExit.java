package number;

import java.util.Scanner;

public class ZeroExit
{
	public static void main(String[] args)
	{
		//print the number if the remainder is 3 when divided by 7 and exit if user press 0
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			int a=sc.nextInt();
			if(a==0)
			{
				return;
			}
			if(a%7==3)
			{
				System.out.println(a);
			}
		}
	}
}
