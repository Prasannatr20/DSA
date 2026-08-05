package math;

public class Automorphic
{
	public static void main(String[] args)
	{
		boolean auto=true;
		int num=34, n=num*num;
		while(num>0)
		{
			if(num%10!=n%10)
			{
				auto =false;
				break;
			}
			num/=10;
			n/=10;
		}
		if(auto) System.out.println(true);
		else System.out.println(false);
	}
}
