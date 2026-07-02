package patterns;

public class EvenNumLeftTriangle {

	public static void main(String[] args)
	{
		int n=4;
		for(int i=1,p=0;i<=n;i++,p+=2)
		{
			for(int j=1;j<=n;j++)
			{
				if(i>=j) System.out.print(p+" ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}

}
