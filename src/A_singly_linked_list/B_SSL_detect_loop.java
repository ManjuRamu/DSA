package A_singly_linked_list;


class B_SSL_detect_loop {
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
	
	//find met pointer and remove the loop
	void removeLoopAlgo(Node slowPtr, Node pre) {
		//where loop start at head we can do this
//		if(slowPtr == head) {
//			while (slowPtr.next != head) {
//				slowPtr = slowPtr.next;
//			}
//		}
		
		//or we can do this as well
		// But we need to keep pre value when we find the met point
		if(slowPtr == head) {
			pre.next = null;
		}
		else {
		 Node current = head;
		  while (slowPtr.next != current.next) {
			slowPtr = slowPtr.next;
		 	current = current.next;
		  }
		  slowPtr.next = null;
		 }
		 System.out.println(hasLoop());
	  
	}
	//find loop is present or not
	void removeLoop() {
		Node fastPtr = head;
		Node slowPtr = head;
		Node pre;
		while (fastPtr != null  && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
		// helps to remove the loop node without complete loop of an list 
	    // if loop node points to head node
			pre =slowPtr; 
			slowPtr = slowPtr.next;
			if(fastPtr == slowPtr) {
				removeLoopAlgo(slowPtr, pre);
			  break;
			}
			
		}
	}
	public void print() {
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
		Node eleven = new Node(11);
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seven;
		seven.next = eight;
		eight.next = nine;
		nine.next =ten;
		ten.next = eleven;
		eleven.next = sll.head; //loop
		System.out.println(sll.hasLoop());
		sll.removeLoop();
		sll.print();
		
	}
}
