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

	private int remove() {
		if(front == null) throw new RuntimeException("Queue is empty");
		Node temp = front;
		front = front.next;
		return temp.data;

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
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		B_QueueImpl queue = new B_QueueImpl();
		queue.add(0);
		queue.add(1);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.display();
		System.out.println();
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		queue.display();

		
	}

}
