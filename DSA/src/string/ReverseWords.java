package string;

public class ReverseWords {

	public static void main(String[] args)
	{
		String str= " My sky is Blue";
		StringBuilder sb= new StringBuilder();
		int n= str.length();
		
		String a=reverse(str);
		
		for(int i=0;i<n;i++)
		{
			String word="";
			while(i<n && a.charAt(i)!=' ')
			{
				word+=a.charAt(i);
				i++;
			}
			if(word.length()>0)
			{
				sb.append(" " +reverse(word));
			}
		}
		sb.deleteCharAt(0);
		System.out.println(sb);
	}
	static String reverse(String s)
	{
		int n=s.length();
		String reverse="";
		for(int i=n-1;i>=0;i--)
		{
			reverse+=s.charAt(i);
		}
		return reverse;
	}
}
