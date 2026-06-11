package number;

public class Special {

	public static void main(String[] args)
	{
		//59=5+9+5*9
		int n=19,m=n;
		int sum=0,prod=1;
		while(m!=0)
		{
			int d=m%10;
			sum+=d;
			prod*=d;
			m/=10;
		}
		System.out.println(sum);
		System.out.println(prod);
		if(sum+prod==n) System.out.println("Sp");
		else System.out.println("No");
	}

}
