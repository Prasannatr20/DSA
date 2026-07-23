package doublyLinkeList;

public class Song
{
	String data;
	Song next;
	Song prev;
	
	Song()
	{
		
	}
	Song(String data)
	{
		this.data=data;
	}
	Song(String data, Song next)
	{
		this.data=data;
		this.next=next;
	}
	Song(String data, Song next, Song prev)
	{
		this.data=data;
		this.next=next;
		this.prev=prev;
	}
}
