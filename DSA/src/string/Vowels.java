package string;

public class Vowels {

	public static void main(String[] args)
	{
		String str= "PrAsaNnA";
		String str1= str.toLowerCase();
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
			char c= str1.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') count++;
		}
		System.out.println(count);
	}

}
