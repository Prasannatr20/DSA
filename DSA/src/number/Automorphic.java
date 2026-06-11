package number;

public class Automorphic {

	public static void main(String[] args)
	{
		//5=5*5=25, 5 is same; how many digit -1 should be same. 25=25*25=625, 25 is same. 
		int n=25,m=n*n,temp=n;
		
		if(n==0) 
		{
			System.out.println("auto");
			return;
		}
		while(temp!=0)
		{
			if(temp%10!=m%10)
			{
				System.out.println("not");
				return;
			}
			temp/=10;
			m/=10;
		}
		System.out.println("Auto");
	}

}
