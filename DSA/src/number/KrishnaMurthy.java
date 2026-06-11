package number;

public class KrishnaMurthy {

	public static void main(String[] args)
	{
		//145=1!+4!+5!
		int n=145,m=n, prod=1,sum=0;
		while(m!=0)
		{
			int d=m%10;
			for(int i=d;i>=1;i--)
			{
				prod=prod*i;
			}
			sum+=prod;
			prod=1;
			m/=10;
		}
		if(sum==n) System.out.println("KM");
		else System.out.println("No");
	}

}
