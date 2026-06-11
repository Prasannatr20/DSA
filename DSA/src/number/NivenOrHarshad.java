package number;

public class NivenOrHarshad {

	public static void main(String[] args)
	{
		//156=1+5+6=12; 156/12==0 or not
		int n=156,m=n;
		int sum=0;
		while(m!=0)
		{
			int d=m%10;
			sum+=d;
			m/=10;
		}
		if(n%sum==0)
		{
			System.out.println("NH");
		}
		else System.out.println("Not");
	}

}
