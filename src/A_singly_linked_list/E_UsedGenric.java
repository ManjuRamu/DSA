package A_singly_linked_list;

public class E_UsedGenric<T> {
	private Node head;

	private static class Node<T> {
		T data;
		Node next;

		Node(T data) {
			this.data = data;
		}
	}
	private void add(T data) {
     Node newNode = new Node(data);
     if(head == null) {
    	 head = newNode;
     }
     else {
    	 Node cur  = head;
    	 while (cur.next != null) {
			cur = cur.next;
		}
    	 cur.next = newNode;
     }
	}
	private void prin() {
	Node temp = head;
	while (temp != null) {
		System.out.print(temp.data +"->");
		temp =temp.next;
	}

	}
 public static void main(String[] args) {
 	E_UsedGenric<String> list = new E_UsedGenric<String>();
 	list.add("abc");
 	list.add("def");
 	list.add("ghi");
     list.prin();	
 }
}
