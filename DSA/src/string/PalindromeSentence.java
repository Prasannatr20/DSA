package string;

public class PalindromeSentence {

	public static void main(String[] args)
	{
		String str ="A man, a plan, a canal: Panama";
		int left=0;
		int right =str.length()-1;
		boolean palindrome = true;
		while(left<right)
		{
			char l=str.charAt(left);
			char r=str.charAt(right);
			if(!Character.isLetterOrDigit(l))
			{
				left++;
				continue;
			}
			if(!Character.isLetterOrDigit(r))
			{
				right--;
				continue; 
			}
			if(Character.toLowerCase(l)!=Character.toLowerCase(r))
			{
				palindrome=false;
				break;
			}
			left++;
			right--;
		}
		if(palindrome) System.out.println("palindrome");
		else System.out.println("not");
	}

}
