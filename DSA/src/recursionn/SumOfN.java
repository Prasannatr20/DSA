package recursionn;

public class SumOfN {

	public static void main(String[] args)
	{
		sum(1, 10, 0);
	}
	static void sum(int i, int n, int sum)
	{
		if(i==n)
		{
			System.out.println(sum+=i);
			return;
		}
		sum+=i;
		sum(i+1, n, sum);
	}

}
