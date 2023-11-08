package C_CircularSinglyLinkList;


public class A_CircularLinklyList {
	Node last;
	
	private static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	 public void print() {
			Node first = last.next;
			while (last != first) {
				System.out.print(first.data +"-> ");
				first = first.next;
			}
			System.out.println(first.data);
		}

	public static void main(String[] args) {
		// single node
		Node single = new Node(0);
		A_CircularLinklyList singleList = new A_CircularLinklyList();
		singleList.last = single;
		single.next = singleList.last;

		Node first = new Node(0);
		Node second = new Node(1);
		Node third = new Node(3);

		first.next = second;
		second.next = third;
		third.next = first;

		A_CircularLinklyList list = new A_CircularLinklyList();
		list.last = third;
		list.print();
	}
}
