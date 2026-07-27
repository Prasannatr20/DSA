package math;

public class Prime {

	public static void main(String[] args)
	{
		System.out.println(prime(4));
	}
	static boolean prime(int n)
	{
		if(n<=1) return false;
		int count=0;
		for(int i=2;i<=n/2;i++)	if(n%i==0) count++;
		if(count==0) return true;
		return false;
	}
}
