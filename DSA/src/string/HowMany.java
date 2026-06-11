package string;

public class HowMany {

	public static void main(String[] args)
	{
		String str="bAnana";
		String str1=str.toLowerCase();
		int count=0;
		char a='a';
//		for(int i=0;i<str.length();i++)
//		{
//			if(str.charAt(i)==a)
//			{
//				count++;
//			}
//		}
		for(char c:str1.toCharArray())
		{
			if(c==a) count++;
		}
		System.out.println(count);
	}

}
