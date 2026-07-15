package linkedList;

public class PlayListCreation
{
	PlayList head;
	
	void addFirst(String data)
	{
		PlayList song= new PlayList(data);
		song.next=head;
		head=song;
	}
	void addLast(String data)
	{
		if(head==null)
		{
			addFirst(data);
			return;
		}
		PlayList temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
	}
}
