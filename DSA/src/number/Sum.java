package number;

public class Sum {

	public static void main(String[] args)
	{
		int n=1234;
		int m=n,sum=0;
		while(m!=0)
		{
			int d=m%10;
			sum+=d;
			m/=10;
		}
		System.out.println(sum);
	}

}
