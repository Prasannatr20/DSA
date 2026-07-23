package math;

public class Palindrome {

	public static void main(String[] args)
	{
		int num=121, copy=num;
		int a=reverse(num);
		System.out.println(palindrome(a,copy));
	}
	static int reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int temp=num%10;
			rev=(rev*10)+temp;
			num/=10;
		}
		return rev;
	}
	static boolean palindrome(int n1, int n2)
	{
		if(n1==n2) return true;
		return false;
	}
}
