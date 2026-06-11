package number;

public class Spy {

	public static void main(String[] args) {
		//123;1+2+3=1*2*3
		int n=1124;
		int m=n;
		int sum=0,prod=1;
		while(m!=0)
		{
			int d=m%10;
			sum=sum+d;
			prod=prod*d;
			m/=10;
		}
		if(sum==prod)
		{
			System.out.println("Spy");
		}
		else
			System.out.println("no");
	}

}
