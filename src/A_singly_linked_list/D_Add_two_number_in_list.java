package A_singly_linked_list;



/*
 * a   = 321
 * b   = 699
 * sum = 9111
 * Assume numbers are stored in reverse order */

public class D_Add_two_number_in_list {
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
	
	private static Node sum(Node a, Node b) {
		Node dummy = new Node(0);
		Node tail = dummy;
		int carry = 0;
		while (a != null || b != null) {
			int x = a == null ? 0 :a.data;
			int y = b == null ? 0 :b.data;
            int sum = x+y+carry;
            carry = sum/10;
            tail.next = new Node(sum%10);
            tail = tail.next;
            a= a.next;
            b =b.next;
			
		}
		if(carry > 0) {
			tail.next = new Node(carry);
		}
		return dummy.next;
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
	D_Add_two_number_in_list list1 = new D_Add_two_number_in_list();
	D_Add_two_number_in_list list2 = new D_Add_two_number_in_list();
     list1.add(3);
     list1.add(2);
     list1.add(1);

     list2.add(6);
     list2.add(9);
     list2.add(9);
     Node sumList = sum(list1.head,list2.head);
     print(sumList);
     
}
}
