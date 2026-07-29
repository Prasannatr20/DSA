package recursionn;

public class Fibonacci {

	public static void main(String[] args)
	{
		int a=0, b=1, n=10;
		System.out.println(a);
		System.out.println(b);
		fibonacci(a, b, n-2);
	}
	static void fibonacci(int a, int b, int n)
	{
		if(n==0) return;
		int next=a+b;
		System.out.println(next);
		fibonacci(b, next, n-1);
	}
}