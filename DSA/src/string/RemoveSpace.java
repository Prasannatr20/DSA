package string;

public class RemoveSpace {

	public static void main(String[] args)
	{
		String str=" Hel lo Wo  rld  ";
		String str1="";
//		String str1=str.replaceAll(" ", "");
		for(int i=0;i<=str.length()-1;i++)
		{
			char c= str.charAt(i);
			if(c!=' ')
			{
				str1+=c;
			}
		}
		System.out.println(str1);
	}

}
