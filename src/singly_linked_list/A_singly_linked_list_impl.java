package singly_linked_list;

public class A_singly_linked_list_impl {
	private ListNode head;
	private int count = 0;

	// node of a singly_link_list
	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// print the list
	public void print() {
		ListNode current = head;
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

	// length of an list
	public int length() {
		ListNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	/*
	 * insert an node of at the beginning steps: 1. create a new node. 2. new node
	 * next need to point to head. 3. head need to point to new node.
	 */

	public boolean insertAtBegining(int data) {
		try {
			ListNode newNode = new ListNode(data);
			newNode.next = head;
			head = newNode;
			return true;
		} catch (Exception ex) {
			System.out.println(ex);
			return false;
		}

	}

	/*
	 * create a new node check if head == null if yes then assign new node to head
	 * else iterate a head until you find null at next property once you got put new
	 * node to at last next node
	 */
	public boolean add(int data) {
		try {
			ListNode newNode = new ListNode(data);
			if (head == null) {
				head = newNode;
				return true;
			}
			ListNode current = head;
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

//	ListNode current = head;
//	ListNode temp = null;
//	while (current != null && position != 0) {
//		temp = current;
//		current = current.next;
//		position--;
//	}
//	temp.next = newNode;
//	newNode.next = current;
//	return true;
	/*
	 * insert a node element in an given position: create a newNode position should
	 * be 0 to length-1; Find an node which position; store the next node in temp
	 * node; point the current to newNode point newNode next to temp node
	 */
	public boolean add(int data, int position) {
		try {
			ListNode newNode = new ListNode(data);
			if (head == null || position == 0) {
				newNode.next = head;
				head = newNode;
				return true;
			}
			ListNode previous = head;
			while (previous != null && previous.next != null && position > 1) {
				previous = previous.next;
				position--;
			}
			ListNode current = previous.next;
			previous.next = newNode;
			newNode.next = current;
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		}
	
	public boolean deleteFirst() {
		try {
			if(head != null) {
				head = head.next;
			}
			
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}
	
	public boolean deleteLast() {
		try {
			ListNode current = head;
			ListNode previous = current;
			while(current.next != null) {
				previous = current;
				current = current.next;
			}
			previous.next = null;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}
	
	/*
	 * position 0 ->  head so on
	 * */
	public boolean delete(int position) {
	try {
		if(head == null) return false;
	    int count = 0;
	    ListNode current = head;
	    ListNode previous = null;
		while(position >= 0 && current != null) {
			previous = current;
			current = current.next;
			count++;
			position--;
		}
		
		
		
	} catch (Exception e) {
      System.out.println(e);
      return false;
	}
	return true;
	}
	

	public static void main(String[] args) {
		A_singly_linked_list_impl sll = new A_singly_linked_list_impl();

		// creates the nodes without refer to next node
		sll.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);

		// refer to next node i.e chain the nodes to make as a list
		sll.head.next = second; // 10 -> 20
		second.next = third; // 20 -> 30
		third.next = fourth; // 30 -> 15
		sll.deleteLast();
		sll.print();

	}

}