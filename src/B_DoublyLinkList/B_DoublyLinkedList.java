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
		Node(int data){
			this.data = data;
			this.next = null;
			this.previous = null;
		}
	}
	
	
	Node add(int data) {
		Node newNode= new Node(data);
		Node current = head;
		Node last = tail;
		length++;
		if(head == null) {
			head = newNode;
			tail = head;
		}
		else {
			newNode.previous = tail;
			tail.next = newNode;
		    tail = tail.next;
		}
		return head;
	}
	public void addLast(int data) {
		length++;
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = head;
		}
		else {
			newNode.previous = tail;
			tail.next = newNode;
			tail = tail.next;
		}
	}
	
	public boolean isEmpty() {
		return length == 0 ? true: false; 
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
			// printing improving
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
		if(head == null) {
			head = new Node(data);
			tail = head;
		}
		else {
		Node newNode = new Node(data);
		head.previous = newNode;
		newNode.next = head;
		head  = newNode;
		}
	}
	
	

public static void main(String[] args) {
	B_DoublyLinkedList list = new B_DoublyLinkedList();
//	list.add(0);
//	list.add(20);
//	list.add(30);
//	list.add(2);
//	list.add(2);
	list.addFirst(1);
	list.addFirst(3);
	list.addLast(55);
	list.addLast(95);
	print(list.head);
	printReverse(list.tail);
	System.out.println(list.length());
}
}
