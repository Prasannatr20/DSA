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
		PlayList song= new PlayList(data);
		temp.next=song;
	}
	void insert(int index, String data)
	{
		if(index<0)
		{
			System.out.println("Enter a valid index");
			return;
		}
		if(index==0)
		{
			addFirst(data);
			return;
		}
		int count=0;
		PlayList temp=head;
		while(temp!=null && count==index-1)
		{
			count++;
			temp=temp.next;
		}
		if(temp==null)
		{
			System.out.println("Enter a valid index");
			return;
		}
		PlayList song = new PlayList(data);
		song.next=temp.next;
		temp.next=song;
	}
	void removeBasedOnIndex(int index)
	{
		if(index<0)
		{
			System.out.println("Enter a valid index");
			return;
		}
		if(index==0)
		{
			head=head.next;
			return;
		}
		PlayList temp= head;
		int count=0;
		while(temp.next!=null && count==index-1)
		{
			temp=temp.next;
			count++;
		}
		if(temp.next==null)
		{
			System.out.println("Enter a valid index");
			return;
		}
		temp.next=temp.next.next;
	}
	void removeBasedOnName(String data)
	{
		PlayList temp= head;
		while(temp.next!=null && !temp.next.data.equals(data))
		{
			temp= temp.next;
		}
		if(temp.next==null)
		{
			System.out.println("Entered song is not in the Playlist");
			return;
		}
		temp.next=temp.next.next;
	}
	void search(String data)
	{
		int count=0;
		PlayList temp=head;
		while(temp!=null)
		{
			count++;
			if(temp.data.equals(data))
			{
				System.out.println(count);
				return;
			}
			if(temp.data.contains(data))
			{
				System.out.println(count);
				return;
			}
			temp=temp.next;
		}
		System.out.println("This song is not available in your Playlist");
	}
	void reverse()
	{
		
		PlayList next=null;
		PlayList curr=head;
		PlayList prev=null;
		if(curr==null)
		{
			System.out.println(head.data);
			return;
		}
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
	}
	void display()
	{
		PlayList temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data+ "->");
			temp=temp.next;
		}
	}
	void size()
	{
		PlayList temp=head;
		int count=0;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		System.out.println("You have "+count+" in your Playlist");
	}
}
