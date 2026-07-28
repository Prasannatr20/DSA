package math;

public class Amstrong {

	public static void main(String[] args)
	{
		int a=1634;
		int b=a;
		int c=(amstrong(b));
		if(c==a) System.out.println("True");
		else System.out.println("False");
	}
	static int amstrong(int n)
	{
		int m=n;
		int count=count(n), sum=0;
		while(m!=0)
		{
			int temp=m%10;
			int pow=1;
			for(int i=1;i<=count;i++)
			{
				pow*=temp;
			}
			sum+=pow;
			m/=10;
		}
		return sum;
	}
	static int count(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n/=10;
		}
		return count;
	}
}
