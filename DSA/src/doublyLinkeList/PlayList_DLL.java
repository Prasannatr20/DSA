package doublyLinkeList;

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
		newSong.next=head;
		head.prev=newSong;
		head=newSong;
	}
	void addLast(String data)
	{
		if(head==null)
		{
			addFirst(data);
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
		if(index<0|| index>size)
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
		temp.next.prev=newSong;
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
	void delete(int index)
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
		if(temp==tail)
		{
			deleteLast();
			return;
		}
		temp.prev.next=temp.next;
		temp.next.prev=temp.prev;
		temp.next=null;
		temp.prev=null;
		size--;
	}
	void display()
	{
		Song temp= head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ->");
			temp=temp.next;
		}
		 System.out.println("null");
	}
	void reversePlaylist()
	{
		Song temp=tail;
		while(temp!=null)
		{
			System.out.print(temp.data+" ->");
			temp=temp.prev;
		}
		System.out.println("null");
	}
	void search(String data)
	{
		Song temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			if(temp.data.contains(data))
			{
				System.out.println(count);
				return;
			}
			temp=temp.next;
		}
		System.out.println("There is no song that you searched for");
	}
}
