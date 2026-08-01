package recursionn;

public class Palindrome {

	public static void main(String[] args)
	{
		String str="A man, a plan, a canal: Panama";
		char[] arr=str.toLowerCase().toCharArray();
		
		boolean bool= palindrome(arr, 0, arr.length-1);
		System.out.println(bool);
	}
	static boolean palindrome(char[] arr, int start, int end)
	{
		if(start>=end) return true;
		if(!Character.isLetterOrDigit(arr[start]))
			return palindrome(arr, start+1, end);
		if(!Character.isLetterOrDigit(arr[end]))
			return palindrome(arr, start, end-1);
		if(arr[start]!=arr[end]) return false;
		return palindrome(arr, start+1, end-1);
	}
}
