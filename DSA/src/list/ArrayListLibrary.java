package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListLibrary {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		List<String> library= new ArrayList<>();
		library.add("To Kill a Mockingbird");
		library.add("Tuesdays with Morrie");
		library.add("In Search of Lost Time");
		library.add("The Great Gatsby");
		library.add("One Hundred Years of Solitude");
		library.add("Moby-Dick by Herman Melville");
		library.add("Don Quixote");
		library.add("Anna Karenina");
		library.add("War and Peace");
		library.add("The Tragedy of Julius Caesar");
		System.out.println("Select book by index or name");
		System.out.println("Enter 1 for index");
		System.out.println("Enter 2 for name");
		int book=scan.nextInt();
		if(book==1)
		{
			System.out.println(library.get(scan.nextInt())+",1 There you go!");
		}
		else if(book==2)
		{
			scan.nextLine();
			System.out.println("Enter book name");
			String bookName =scan.nextLine();
			if(library.contains(bookName)) System.out.println("There you go!");
			else System.out.println(bookName+" is currently not available");
		}
		else System.out.println("Enter a valid number");
	}

}
