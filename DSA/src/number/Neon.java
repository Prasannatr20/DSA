package number;

public class Neon {

	public static void main(String[] args)
	{
		//9=9*9=81;81=8+1=9;
		int n=9,m=n*n,sum=0;
		while(m!=0)
		{
			int d=m%10;
			sum+=d;
			m/=10;
		}
		if(sum==n) System.out.println("Yes");
		else System.out.println("No");
	}

}
