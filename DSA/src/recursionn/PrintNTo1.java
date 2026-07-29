package recursionn;

public class PrintNTo1 {

	public static void main(String[] args)
	{
		printNum(10);
	}
	static void printNum(int n)
	{
		if(n==0) return;
		System.out.println(n);
		printNum(n-1);
	}
}
