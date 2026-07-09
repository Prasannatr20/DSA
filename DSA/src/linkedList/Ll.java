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
	void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println("null");
	}
}
