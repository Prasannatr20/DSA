package hashTable;

import java.util.Hashtable;
import java.util.Scanner;

public class SupermartProject
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args)
	{
		
	}
	
	static Hashtable<String, Integer> put(String fruit, Integer quantity)
	{
		Hashtable<String, Integer> t= new Hashtable<>();
		t.put(fruit, quantity);
		return t;
	}
	static Hashtable<String, Integer> remove(String fruit, Integer quantity)
	{
		Hashtable<String, Integer> t= new Hashtable<>();
		t.remove(fruit);
		return t;
	}
}