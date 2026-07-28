package math;

public class GCD {

	public static void main(String[] args)
	{
		System.out.println(gcd(18,36));
	}
	//Brute force
	static int gcd(int n, int m)
	{
		int gcd=0;
		for(int i=1;i<=n && i<=m;i++)
		{
			if(n%i==0 && m%i==0)
			{
				gcd=i;
			}
		}
		return gcd;
	}
}
