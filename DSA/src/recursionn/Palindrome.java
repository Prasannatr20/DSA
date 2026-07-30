package recursionn;

public class Palindrome {

	public static void main(String[] args)
	{
		String str="Malayalam";
		String str2=str.toLowerCase() ;
		char[] arr=str.toLowerCase().toCharArray();
		
		palindrome(arr, 0, arr.length-1);
		
		str=new String(arr);
		
		if(str.equals(str2)) System.out.println("True");
		else System.out.println("False");
	}
	static void palindrome(char[] arr, int start, int end)
	{
		if(start>=end) return;
		char c=arr[start];
		arr[start]=arr[end];
		arr[end]=c;
		palindrome(arr, start+1, end-1);
	}
}
