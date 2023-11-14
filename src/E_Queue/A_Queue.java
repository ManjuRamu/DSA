package E_Queue;

public class A_Queue {
	Node front;
	Node rear;

	private static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);

		A_Queue queue = new A_Queue();
		queue.front = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		queue.rear = fifth;

	}

}
