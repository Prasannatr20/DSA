package number;

public class Amstrong {

	public static void main(String[] args)
	{
		//153=1^3+5^3+3^3; 1634= 1^4+6^4+3^3+4^3;
		int n=153, m=n,count=0,sum=0;
		while(m!=0)
		{
			count++;
			m/=10;
		}
		m=n;
		while(m!=0)
		{
			int d=m%10;
			int pow=1;
			for(int i=1;i<=count;i++)
			{
				pow*=d;
			}
			sum+=pow;
			m/=10;
		}
		if(sum==n) System.out.println("Amstrong");
		else System.out.println("not");
	}

}
