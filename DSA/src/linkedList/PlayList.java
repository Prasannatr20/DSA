package linkedList;

public class PlayList
{
	String data;
	PlayList next;
	PlayList()
	{
		
	}
	PlayList(String data)
	{
		this.data=data;
	}
	PlayList(String data, PlayList next)
	{
		this.data=data;
		this.next=next;
	}
	
}
