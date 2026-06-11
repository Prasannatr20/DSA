package number;

public class DiffLines {

	public static void main(String[] args)
	{
		int a=1234;
		int b=0;
		while(a!=0)
		{
			int d =a%10;
			b=b*10+d;
			a/=10;
		}
		
		
		while(b!=0)
		{
			int d=b%10;
			System.out.println(d);
			b/=10;
		}
	}

}
