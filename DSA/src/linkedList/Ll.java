package linkedList;

public class Ll
{
	Node head= null;
	void addFirst(int data)
	{
		Node newNode= new Node(data);
		newNode.next= head;
		head=newNode;
	}
	void addLast(int data)
	{
		if(head==null)
		{
			addFirst(data);
			return;
		}
		Node newNode = new Node(data);
		Node temp= head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
	}
	void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.print("null");
	}
}
