package linkedList;

public class PlayList_DLL
{
	Song head=null;
	Song tail=null;
	int size=0;
	
	void addFirst(String data)
	{
		Song newSong= new Song(data);
		size++;
		if(head==null)
		{
			head=tail=newSong;
			return;
		}
		newSong.next=head.prev;
		head.prev=newSong;
		head=newSong;
	}
	void addLast(String data)
	{
		if(head==null)
		{
			head=tail=null;
			return;
		}
		Song newSong= new Song(data);
		size++;
		newSong.prev=tail;
		tail.next=newSong;
		tail=newSong;
	}
	void insert(int index, String data)
	{
		if(index<0)
		{
			System.out.println("Enter a valid index");
			return;
		}
		if(index==0 || head==null)
		{
			addFirst(data);
			return;
		}
		Song temp=head;
		int count=0;
		while(temp.next!=null && count<index-1)
		{
			temp=temp.next;
			count++;
		}
		if(temp.next==null)
		{
			addLast(data);
			return;
		}
		Song newSong= new Song(data);
		size++;
		newSong.prev=temp;
		newSong.next=temp.next;
		temp.next=newSong;
	}
	void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("No songs to delete");
			return;
		}
		if(size==1)
		{
			head=tail=null;
			size--;
			return;
		}
		Song temp=head;
		head=head.next;
		head.prev=null;
		temp.next=null;
		size--;
	}
	void deleteLast()
	{
		if(head==null)
		{
			System.out.println("No songs to delete");
			return;
		}
		if(size==1)
		{
			head=tail=null;
			size--;
			return;
		}
		Song temp= tail;
		tail=tail.prev;
		tail.next=null;
		temp.prev=null;
		size--;
	}
	void delete(int index, String data)
	{
		if(index>=size)
		{
			System.out.println("Enter a valid index");
			return;
		}
		if(index==0)
		{
			deleteFirst();
			return;
		}
		int count=0;
		Song temp=head;
		while(temp!=null && count!=index)
		{
			temp=temp.next;
			count++;
		}
		if(temp==null)
		{
			deleteLast();
			return;
		}
		temp.prev.next=temp.next;
		temp.next.prev=temp.prev;
		temp.next=null;
		temp.prev=null;
	}
}
