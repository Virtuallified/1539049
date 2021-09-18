package listpack;

import nodepack.*;

public class Linklist
{

	public Node head;

	public Linklist()
	{
		head=null;
	}
   
	public void createList(Node n)
	{
		if(head==null)
		{
			head=n;
		}
		else
		{
			n.next=head;
			head=n;
		}
	}	

	public void display()
	{
		while(head!=null)
		{
			System.out.println("List value is " +head.info);
			head=head.next;
		}
	}
	 
}