package recursionn;

public class OneToN {

	public static void main(String[] args)
	{
		numbers(10);
	}
	static void numbers(int n)
	{
		if(n==0) return;
		numbers(n-1);
		System.out.println(n);
	}
}
