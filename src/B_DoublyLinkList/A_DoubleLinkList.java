package B_DoublyLinkList;


//two way link list, like next and previous
public class A_DoubleLinkList {
	Node head = null;
   private static class Node{
	   int data;
	   Node next;
	   Node previous;
	  
	   Node(int data){
		   this.data = data;
		   this.previous = null;
		   this.next = null;
	   }
   }
	public static void print(Node head) {
		Node current = head;
		while (current != null) {
			// printing improving
			if (current.next != null)
				System.out.print(current.data + " -> ");
			else {
				System.out.println(current.data);
			}
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		
		// next and previous links of an each node
		first.next = second;
		second.previous = first;
		
		second.next = third;
		third.previous = second;
		
		third.next = fourth;
		fourth.previous = third;
		
		fourth.next = fifth;
		fifth.previous = fourth;
		
		
		A_DoubleLinkList list = new A_DoubleLinkList();
        list.head = first;
        print(list.head);
        
        
		
	}
}
