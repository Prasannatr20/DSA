package hashTable;

import java.util.Hashtable;
import java.util.Scanner;

public class SupermartProject
{
	static Scanner scan= new Scanner(System.in);
	static Hashtable<String, Integer> t= new Hashtable<>();
	public static void main(String[] args)
	{
		System.out.println("Actions that you can perform");
		System.out.println("Press for: \n"
				+ "1. Add Fruit and quantity\n"
				+ "2. Remove a fruit\n"
				+ "3. Display Friut and respective quantity\n"
				+ "4. See if a fruit is present\n"
				+ "5. Total no.of fruits\n"
				+ "6. Show all fruits\n"
				+ "7. Clear all fruits\n"
				+ "0. Exit");
		int action;
		boolean val=true;
		while(val)
		{
			action= scan.nextInt();
			scan.nextLine();
			if(action==0) val=false;
			switch(action)
			{
				case 1:
					System.out.println("Enter fruit and quantity");
					put(scan.next(), scan.nextInt());
				break;
				case 2:
					System.out.println("Enter fruit");
					remove(scan.next());
				break;
				case 3: show();
				break;
				case 4: present(scan.next());
				break;
				case 5: size();
				break;
				case 6: showAllFruits();
				break;
				case 7: clear();
				break;
				default: System.out.println("Enter a valid number");
			}
		}
	}
	
	static void put(String fruit, Integer quantity)
	{
		t.put(fruit, quantity);
		System.out.println("Added");
	}
	static void remove(String fruit)
	{
		if(t.containsKey(fruit))
		{
			t.remove(fruit);
		}
		else
		{
			System.out.println("The fruit you entered is not available/ Enter correct spelling");
			return;
		}
		System.out.println("Removed");
	}
	static void show()
	{
		for(String i:t.keySet())
		{
			System.out.println(i+"  : "+ t.get(i));
		}
		System.out.println("End of list");
	}
	static void present(String fruit)
	{
		if(t.containsKey(fruit))
		{
			System.out.println(fruit +" "+ "is available  Qty is: "+ t.get(fruit));
		}
		else
		{
			System.out.println(fruit +" "+ "is not available");
		}
	}
	static void size()
	{
		System.out.println(t.size());
	}
	static void showAllFruits()
	{
		System.out.println(t.values());
	}
	static void clear()
	{
		t.clear();
		System.out.println("Cleared");
	}
}