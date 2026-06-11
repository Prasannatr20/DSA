package number;

public class HexaToByte {

	public static void main(String[] args)
	{
		String hexa="ff";
		int res=0;
		hexa=hexa.toUpperCase();
		if(hexa.length()>2 || hexa.length()==0)
		{
			System.out.println("Enter valid");
			return;
		}
		for(int i=0;i<hexa.length();i++)
		{
			char ch= hexa.charAt(i);
			if((ch>='0' && ch<='9') || (ch>='A' && ch<='F')) 
			{
				int digitValue=0;
				if(ch>='0' && ch<='9')
				{
					digitValue=ch-'0';
				}
				else
				{
					digitValue=ch-'A'+10;
				}
				res=res*16+digitValue;
			}
			else
			{
				System.out.println("enter a valid hexa");
				return;
			}
		}
		System.out.println(res);
	}

}
