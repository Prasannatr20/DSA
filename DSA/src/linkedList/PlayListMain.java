package linkedList;

import java.util.Scanner;

public class PlayListMain {

	public static void main(String[] args)
	{
		PlayListCreation songList= new PlayListCreation();
		Scanner scan= new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1 for Add song at beginning");
		System.out.println("2 for Add song at end\n"
				+ "3 for Insert song at a position\n"
				+ "4 for Remove a song by index\n"
				+ "5 to Remove a song  by name\n"
				+ "6 for Search song\n"
				+ "7 to reverse your PlayList\n"
				+ "8 to Display playlist\n"
				+ "9 for Count total songs\n"
				+ "0 to exit");
		int val;
		String data;
		int index;
		boolean action =true;
		while(action)
		{
			val=scan.nextInt();
			if(val==0) action =false;
			switch(val)
			{
			case 1:
				System.out.println("Enter song: ");
				data= scan.next();
				scan.next();
				songList.addFirst(data);
				break;
			case 2:
				System.out.println("Enter song: ");
				data= scan.next();
				scan.next();
				songList.addLast(data);
				break;
			case 3:
				System.out.println("Enter position: ");
				index=scan.nextInt();
				System.out.println("Enter song: ");
				data=scan.next();
				scan.next();
				songList.insert(index, data);
				break;
			case 4:
				System.out.println("Enter position: ");
				index=scan.nextInt();
				songList.removeBasedOnIndex(index);
				break;
			case 5:
				System.out.println("Enter song: ");
				data=scan.next();
				scan.next();
				songList.removeBasedOnName(data);
				break;
			case 6:
				System.out.println("Enter song: ");
				data= scan.next();
				scan.next();
				songList.search(data);
				break;
			case 7:
				songList.reverse();
				break;
			case 8:
				songList.display();
				break;
			case 9:
				songList.size();
				break;
			default:
				System.out.println("Choose a valid option");
			}
		}
		scan.close();
	}
}