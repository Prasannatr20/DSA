package math;

public class Spy
{
	public static void main(String[] args)
	{
		int num= 123, n=num, sum=0, prod=1;
		while(n!=0)
		{
			int temp= n%10;
			sum=sum+temp;
			prod=prod*temp;
			n/=10;
		}
		if(sum==prod) System.out.println("True");
		else System.out.println("False");
	}
}
