package string;

public class UpperCase {

	public static void main(String[] args)
	{
		String str="PrAsanNa";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				System.out.println(str.charAt(i));
			}
		}
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				System.out.println(str.charAt(i));
			}
		}
	}

}
