package recursion;

public class Numbers 
{
	static void print(int n)
	{
		if(n==5)
		{
			System.out.println(5);
		}
		else
		{
			System.out.println(n);
			print(n+1);
		}
	}
	public static void main(String[] args)
	{
		Numbers.print(0);
	}

}
