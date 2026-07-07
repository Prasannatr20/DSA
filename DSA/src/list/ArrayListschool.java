package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListschool {
	static Scanner scan = new Scanner(System.in);
	static List<String> school= new ArrayList<>();
	public static void main(String[] args)
	{
		System.out.println("Actions that you can perform");
		System.out.println("Press for: \n"
				+ "1. Add Student\n"
				+ "2. Display Students\n"
				+ "3. Search Student\n"
				+ "4. Update Student\n"
				+ "5. Remove Student\n"
				+ "6. Sort Students\n"
				+ "7. Reverse Student List\n"
				+ "8. Show Total Students\n"
				+ "9. Clear All Students\n"
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
				case 1: addStudents();
				break;
				case 2: displayAllStudents();
				break;
				case 3: searchStudents();
				break;
				case 4: updateStudents();
				break;
				case 5: removeStudents();
				break;
				case 6: sortStudents();
				break;
				case 7: reverseStudents();
				break;
				case 8: totalStudents();
				break;
				case 9: clearAll();
				break;
				default: System.out.println("Entar a valid number");
			}
		}
		return;
	}
	static void addStudents()
	{
		while(true)
		{
			System.out.println("Enter a student name: ");
			String a=scan.nextLine().toLowerCase();
			school.add(a);
			System.out.println("Want to add another student? Y/N");
			String c= scan.nextLine();
			if(c.equalsIgnoreCase("N")) break;
//			school.add("apple");
//			school.add("ball");
//			school.add("cat");
//			school.add("dog");
		}
	}
	static void displayAllStudents()
	{
		System.out.println(school);
	}
	static void searchStudents()
	{
		System.out.println("Enter roll num or name");
		int rollNum=-1;
		String name="";
		if(scan.hasNextInt())
		{
			rollNum= scan.nextInt();
			scan.nextLine();
			try
			{
				System.out.println(school.get(rollNum));
				System.out.println("Want to search other students?: Y/N");
				String s=scan.nextLine();
				if(s.equalsIgnoreCase("y")) searchStudents();
			} 
			catch (Exception e)
			{
				System.out.println("Enter a valid Roll Number");
				searchStudents();
			}
		}
		else
		{
			name=scan.nextLine();
			name= name.trim().toLowerCase();
			if(school.contains(name))
			{
				System.out.println("Roll Number is: "+school.indexOf(name));
				System.out.println("Want to search other students?: Y/N");
				String s=scan.nextLine();
				if(s.equalsIgnoreCase("y")) searchStudents();
			}
			else
			{
				System.out.println("Enter a valid name");
				searchStudents();
			}
		}
	}
	static void updateStudents()
	{
		System.out.println("Enter rollNum and Correct spelling of Name");
		int rollNum=scan.nextInt();
		scan.nextLine();
		try
		{
			String editedName= scan.nextLine();
			school.set(rollNum,editedName);
			System.out.println("Want to update other student datum? Y/N");
			String temp= scan.nextLine();
			if(temp.equalsIgnoreCase("y")) updateStudents();
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Enter a valid roll number");
			updateStudents();
		}
	}
	static void removeStudents()
	{
		System.out.println("Enter name or roll number to remove a student data");
		int rollNum=-1;
		String name="";
		if(scan.hasNextInt())
		{
			try
			{
				rollNum= scan.nextInt();
				scan.nextLine();
				school.remove(rollNum);
				System.out.println("Removed successfully");
				System.out.println(school);
				System.out.println("Want to remove another student? Y/N");
				String str= scan.nextLine();
				if(str.equalsIgnoreCase("y")) removeStudents();
			}
			catch(IndexOutOfBoundsException e) 
			{
				System.out.println("Enter a valid roll number");
				removeStudents();
			}
		}
		else
		{
			try
			{
				name= scan.nextLine();
				school.remove(name);
				System.out.println("Removed successfully: " +name);
				System.out.println(school);
				System.out.println("Want to remove another student? Y/N");
				String str= scan.nextLine();
				if(str.equalsIgnoreCase("y")) removeStudents();
			}
			catch(Exception e)
			{
				System.out.println("Enter a valid name/ the name you enter is already removed");
				name= scan.nextLine();
				school.remove(name);
				System.out.println("Removed successfully");
				System.out.println(school);
				System.out.println("Want to remove another student? Y/N");
				String str= scan.nextLine();
				if(str.equalsIgnoreCase("y")) removeStudents();
			}
		}
	}
	static void sortStudents()
	{
		school.sort(null);
		System.out.println(school);
	}
	static void reverseStudents()
	{
		Collections.reverse(school);
		System.out.println(school);
	}
	static void totalStudents()
	{
		System.out.println(school.size());
	}
	static void clearAll()
	{
		school.clear();
		System.out.println(school);
	}
}
