package string;

public class OnlyUpperCase {

	public static void main(String[] args)
	{
		String str= "AppLE";
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				str1+=str.charAt(i);
			}
		}
		System.out.println(str1);
	}

}
