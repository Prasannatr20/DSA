package doublyLinkeList;

import java.util.Scanner;

public class PlayListMain {

	public static void main(String[] args)
	{
		PlayList_DLL playlist= new PlayList_DLL();
		Scanner scan= new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1 to add a song at beginning");
		System.out.println("2 to add a song at end\n"
				+ "3 to insert a song at a position\n"
				+ "4 to Search song\n"
				+ "5 to Reverse you playlist\n"
				+ "6 to Display playlist\n"
				+ "7 to Size of your PlayList\n"
				+ "8 to Delete first\n"
				+ "9 to delete last\n"
				+ "0 to exit");
		String data;
		int index;
		boolean action=true;
		while(action)
		{
			int val= scan.nextInt();
			scan.nextLine();
			switch(val)
			{
			case 1:
				System.out.println("Enter song: ");
				data= scan.nextLine();
				playlist.addFirst(data);
				break;
			case 2:
				System.out.println("Enter song: ");
				data= scan.nextLine();
				playlist.addLast(data);
				break;
			case 3:
				System.out.println("Enter position: ");
				index=scan.nextInt();
				scan.nextLine();
				System.out.println("Enter song: ");
				data=scan.nextLine();
				playlist.insert(index, data);
				break;
			case 4:
				System.out.println("Enter song: ");
				data= scan.nextLine();
				playlist.search(data);
				break;
			case 5:
				playlist.reversePlaylist();
				break;
			case 6:
				playlist.display();
				break;
			case 7:
				System.out.println(playlist.size);
				break;
			case 8:
				playlist.deleteFirst();
				break;
			case 9:
				playlist.deleteLast();
				break;
			case 0:
				action= false;
				break;
			default:
				System.out.println("Choose a valid option");
			}
		}
		scan.close();
	}

}
