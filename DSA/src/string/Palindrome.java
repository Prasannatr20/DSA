package string;

public class Palindrome {

	public static void main(String[] args)
	{
		String str="A man, a plan, a canal: Panama";
		String str1= str.toLowerCase();
		int left=0;
		int right =str1.length()-1;
//		String str2="";
//		for(int i=str1.length()-1;i>=0;i--)
//		{
//			str2+=str1.charAt(i);
//		}
//		if(str1.equals(str2))
//		{
//			System.out.println("Palindrome");
//		}
//		else
//			System.out.println("Not");
		boolean palindrome=true;
		while(left<right)
		{
			if(str1.charAt(left)!=str1.charAt(right))
			{
				System.out.println("Not");
				palindrome=false;
				break;
			}
			left++;
			right--;
		}
		if(palindrome) System.out.println("palindrome");
	}

}
