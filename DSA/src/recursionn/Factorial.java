package recursionn;

public class Factorial {

	public static void main(String[] args)
	{
		System.out.println(fact(5));
	}
	static int fact(int n)
	{
		if(n==1 || n==0) return 1;
		int fact_num=fact(n-1);
		int factorial=fact_num*n;
		return factorial;
	}
}
