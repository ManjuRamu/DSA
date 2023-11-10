package E_Queue;

public class B_QueueImpl {
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

	private void add(int data) {
		Node newNode = new Node(data);
		if (front == null) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
	}
	private void display() {
         Node temp = front;
         while (temp != null) {
			System.out.print(temp.data +" -> ");
		}
	}

	public static void main(String[] args) {
		B_QueueImpl queue = new B_QueueImpl();
		queue.add(0);
		queue.add(1);
		queue.add(3);
		queue.display();
	}

}
