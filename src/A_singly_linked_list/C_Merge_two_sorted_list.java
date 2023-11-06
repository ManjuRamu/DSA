package A_singly_linked_list;


public class C_Merge_two_sorted_list {
	private Node head;
	private static class Node{
		private int data;
		private Node next;
		Node(int data){
		 this.data = data;
		 this.next = null;	
		}
	}
	public boolean add(int data) {
		try {
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
				return true;
			}
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			return true;
		} catch (Exception ex) {
			System.out.println(ex);
			return false;
		}
	}
	
	static Node sortMergeTwoList(Node a, Node b) {
		Node dummyHead = new Node(0);
		Node tail = dummyHead;
		while (a != null && b != null) {
			if(a.data <= b.data) {
				tail.next = a;
				a = a.next;
			}else {
				tail.next= b;
	            b = b.next;
			}
		  tail = tail.next;
		}
		if(a ==null) {
			tail.next = b;
		}
		else {
			tail.next =a; 
		}
		return  dummyHead.next;
		
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
		// sll1 = 1 -> 3 -> 5 -> 10 -> 20
		// sll1 = 2 -> 5 -> 12 -> 30 -> 40
		// result => 1 -> 2 -> -> 3 -> 5 -> 5 -> 10 -> 12 -> 20 -> 30 -> 40
		
		C_Merge_two_sorted_list sll1 = new C_Merge_two_sorted_list();
		sll1.add(1);
		sll1.add(10);
		sll1.add(12);
		
		C_Merge_two_sorted_list sll2 = new C_Merge_two_sorted_list();
		sll2.add(0);
		sll2.add(1);
		sll2.add(2);
		sll2.add(2);
		sll2.add(2);
		sll2.add(2);
		Node shortedList = sortMergeTwoList(sll1.head, sll2.head);
		print(shortedList);
		
		
	}
	
}
