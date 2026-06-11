package number;

public class DecimalToBinary {

	public static void main(String[] args)
	{
		int num=56;
		String str="";
		if(num==0)
		{
			System.out.println(0);
		}
		else
		{
			while(num!=0)
			{
				int r= num%2;
				str=r+ str;
				num/=2;
			}
		}
		System.out.println(str);
	}

}
