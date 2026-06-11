package string;

public class toUpperLower {

	public static void main(String[] args)
	{
		String str="HelLo";
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(Character.isUpperCase(c))
			{
				str1=str1+Character.toLowerCase(c);
			}
			else if(Character.isLowerCase(c))
			{
				str1+=Character.toUpperCase(c);
			}
		}
		System.out.println(str1);
	}

}
