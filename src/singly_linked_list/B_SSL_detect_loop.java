package singly_linked_list;


public class B_SSL_detect_loop {
	Node head = null;

	private static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
   /* 
    * Find starting node of an loop begin
    * used Floyd's Cycle algorithms
    * detectedPoint -> slowPtr and fastPtr met node
    * */
	public Node startingPointOfAnLoop(Node detectedPoint) {
		Node cur = head;
		while (cur != detectedPoint) {
			cur = cur.next;
			detectedPoint = detectedPoint.next;
		}
		return cur;
	}
	

	public Node detectLoopNode() {
		Node fastPtr = head;
		Node slowPrt = head;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPrt = slowPrt.next;
			if(fastPtr == slowPrt) return startingPointOfAnLoop(slowPrt);
		}
        return null;
	}
	
	
	boolean hasLoop() {
		Node fastPtr = head;
		Node slowPrt = head;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPrt = slowPrt.next;
			if(fastPtr == slowPrt) return true;
		}
        return false;
	}

	public static void main(String[] args) {

		B_SSL_detect_loop sll = new B_SSL_detect_loop();
		sll.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		Node seven = new Node(7);
		Node eight = new Node(8);
		Node nine = new Node(9);
		Node ten = new Node(10);
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seven;
		seven.next = eight;
		eight.next = nine;
		nine.next =ten;
		ten.next = eight;
        System.out.println(sll.detectLoopNode().data);
		
	}
}
