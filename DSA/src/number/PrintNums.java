package number;

public class PrintNums {

	public static void main(String[] args)
	{
		//print sequence like 50 51 52 53 54 55 40 41 .....10 11 12 13 14 15
		for(int i=50;i>=10;i-=10)
		{
			for(int j=0;j<=5;j++)
			{
				System.out.println(j+i);
			}
		}
	}
}
