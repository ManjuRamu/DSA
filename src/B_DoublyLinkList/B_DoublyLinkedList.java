package B_DoublyLinkList;

public class B_DoublyLinkedList {
	private int length = 0;
	private Node head;
	private Node tail;

	private static class Node {
		int data;
		Node next;
		Node previous;
		Node tail;

		Node(int data) {
			this.data = data;
			this.next = null;
			this.previous = null;
		}
	}

	Node add(int data) {
		Node newNode = new Node(data);
		Node current = head;
		Node last = tail;
		length++;
		if (head == null) {
			head = newNode;
			tail = head;
		} else {
			newNode.previous = tail;
			tail.next = newNode;
			tail = tail.next;
		}
		return head;
	}

	public void addLast(int data) {
		length++;
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = head;
		} else {
			newNode.previous = tail;
			tail.next = newNode;
			tail = tail.next;
		}
	}

	public boolean isEmpty() {
		return length == 0 ? true : false;
	}

	public int length() {
		return length;
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

	public static void printReverse(Node tail) {
		Node current = tail;
		while (current != null) {
			// printing improving+

			if (current.previous != null)
				System.out.print(current.data + " -> ");
			else {
				System.out.println(current.data);
			}
			current = current.previous;
		}
	}

	public void addFirst(int data) {
		length++;
		if (head == null) {
			head = new Node(data);
			tail = head;
		} else {
			Node newNode = new Node(data);
			head.previous = newNode;
			newNode.next = head;
			head = newNode;
		}
	}

	public void add(int data, int position) {
		Node newNode = new Node(data);
		int count = position;
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else if (position >= length) {
			addLast(data);
			return;
		} else if (position == 0) {
			addFirst(data);
			return;
		} else {
			Node start = head;
			Node end = tail;
			int mid = Math.round(length / 2);
			// go backward
			  
			
			
			// go forward
		
				while (count - 1 > 0 && start.next != null) {
					start = start.next;
					count--;
				}
				Node next = start.next;
				start.next = newNode;
				newNode.previous = start;
				newNode.next = next;
				next.previous = newNode;
				length++;
		}
		
	}
   public void deleteFirst() {
	     if(head == null || head == tail) { 
	    	 head = null;
	     tail = head;}
	     else {
	     head = head.next;
	     head.previous = null;
	     }
	     length--;
}
   public void deleteLast() {
	if(head == null || head == tail) {
		head = null;
		tail = null;
	}else {
		 tail = tail.previous;
		 tail.next = null;
	}
}
	public static void main(String[] args) {
		B_DoublyLinkedList list = new B_DoublyLinkedList();
//	list.add(0);
//	list.add(20);
//	list.add(30);
//	list.add(2);
//	list.add(2);
		list.add(1);
		list.add(2);
		list.add(3);
		list.deleteLast();
//		list.add(10, 10);
		print(list.head);
		printReverse(list.tail);

	}
}
