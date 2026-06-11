package number;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1221;
		int m=n;
		int c=0;
		while(m!=0)
		{
			int d=m%10;
			c=c*10+d;
			m/=10;
		}
		if(c==n)
		{
			System.out.println("p");
		}
		else
			System.out.println("e");
	}

}
