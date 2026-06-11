package number;

public class Duck {

	public static void main(String[] args)
	{
		//if a digit contains 0;
		int n=11920,m=n,count=0;
		while(m!=0)
		{
			int d=m%10;
			if(d==0)
			{
				System.out.println("Duck");
				count=1;
				break;
			}
			m/=10;
		}
		if(count==0) System.out.println("not");
	}

}
