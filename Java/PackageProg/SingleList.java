import nodepack.*;
import listpack.*;

public class SingleList
{
	public static void main(String ar[])
	{
		Node nd=new Node();
		Node nd2=new Node(20);
		Node nd3=new Node(30);
		Node nd4=new Node(40);
		Node nd5=new Node(50);
		Node nd6=new Node(60);
		Linklist ll=new Linklist();
		ll.createList(nd2);
		ll.createList(nd3);
		ll.createList(nd4);
		ll.createList(nd5);
		ll.createList(nd6);
		ll.display();
	}
}