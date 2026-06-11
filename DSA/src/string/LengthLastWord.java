package string;

public class LengthLastWord {

	public static void main(String[] args)
	{
		String str= "Hello world";
		str=str.trim();
		String str1="";
		int count=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch = str.charAt(i);
			if(ch!=' ')
			{
				str1=ch+str1;
				count++;
			}
			else
				break;
		}
		System.out.println(str1);
		System.out.println(count);
	}

}
