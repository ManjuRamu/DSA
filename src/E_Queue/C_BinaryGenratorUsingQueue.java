package E_Queue;

public class C_BinaryGenratorUsingQueue {
	Node top;
	Node rear;

	private static class Node {
		String data;
		Node next;

		Node(String str) {
			this.data = str;
			this.next = null;
		}
	}

	private void offer(String str) {
		Node newNode = new Node(str);
		if (top == null) {
			top = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
	}

	private String poll() {
		Node temp = top;
		top = top.next;
		return temp.data;
	}

	public static void main(String[] args) {
		C_BinaryGenratorUsingQueue queue = new C_BinaryGenratorUsingQueue();
		int n = 10;
		String first = "1";
		queue.offer(first);
		String[] bin = new String[n+1];
		bin[0] = "0";
		for (int i = 1; i <= n; i++) {
			bin[i] = queue.poll();
			queue.offer(bin[i] + "0");
			queue.offer(bin[i] + "1");
		}
		for (int j = 0; j <= n; j++) {
			System.out.println(bin[j]);
		}

	}

}
