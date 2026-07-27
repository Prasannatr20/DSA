package math;

public class Reverse {

	public static void main(String[] args)
	{
		reverse(1234);
	}
	static void reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int temp=num%10;
			if(rev>Integer.MAX_VALUE/10 || rev< Integer.MIN_VALUE/10) System.out.println(0);
			rev=(rev*10)+temp;
			num/=10;
		}
		System.out.println(rev);
	}

}
