package C_CircularSinglyLinkList;

public class B_CircularSinglyLinkList {
	Node last;

	private static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
     public void addFirst(int data) {
    	Node newNode = new Node(data);
		if(last == null) {
			last = newNode;
		}else {
			newNode.next = last.next;
		}
		last.next = newNode;
	}
     public void removeLast() {
		Node temp = last;
		if(temp == last.next) {
			last = null;
			return;
		}
		while (temp.next != last) {
			temp = temp.next;
		}
		temp.next = last.next;
		last  = temp;
		System.out.println(temp.data);
	}
     public void removeFirst() {
		if(last == null) {
			return;
		}
		if(last == last.next) {
			last = null;
			return;
		}
		Node temp = last.next; // garbage removal
		last.next = last.next.next;
		temp= null; // garbage removal
	}
     public void add(int data) {
		Node newNode = new Node(data);
		if(last == null) {
			last = newNode;
			last.next = newNode;
		}else {
			//we can use this
//			Node temp = last.next;
//			last.next = newNode;
//			newNode.next = temp;
//			last = newNode;
			
			//or 
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
	}
     public void print() {
    	 if(last == null) return;
		Node first = last.next;
		while (last != first) {
			System.out.print(first.data +"-> ");
			first = first.next;
		}
		System.out.println(first.data);
	}
	public static void main(String[] args) {
      B_CircularSinglyLinkList list = new B_CircularSinglyLinkList();
      list.add(0);
      list.add(1);
      list.add(2);
      list.add(3);
      list.removeFirst();
      list.removeFirst();
      list.removeFirst();
      list.removeFirst();
      list.removeFirst();
      System.out.println("done");
      list.print();
	}
}
