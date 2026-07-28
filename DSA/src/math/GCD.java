package math;

public class GCD {

	public static void main(String[] args)
	{
		System.out.println(gcd(18,36));
	}
//	static int gcd(int n, int m)
//	{
//		int gcd=0;
//		for(int i=1;i<=n && i<=m;i++)
//		{
//			if(n%i==0 && m%i==0)
//			{
//				gcd=i;
//			}
//		}
//		return gcd;
//	}
	static int gcd(int n, int m)
	{
		if(n==m) return n;
		while(n>0 && m>0)
		{
			if(n>m) n=n%m;
			else m=m%n;
		}
		if(n==0) return m;
		return n;
	}
}
