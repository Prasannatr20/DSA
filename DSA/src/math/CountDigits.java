package math;

public class CountDigits
{
	public static void main(String[] args)
	{
		countDigits(12344);
	}
	static void countDigits(int num)
	{
		int count=0;
		while(num!=0)
		{
			int temp=num%10;
			count++;
			num/=10;
		}
		System.out.println(count);
	}
}
