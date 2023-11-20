package A_singly_linked_list;

public class E_UsedGenricList<T> {
	private Node head;

	private static class Node<U> {
		U data;
		Node next;

		Node(U data) {
			this.data = data;
		}
	}

	private void add(T data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node cur = head;
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = newNode;
		}
	}

	private void prin() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}

	}

	public static void main(String[] args) {
		E_UsedGenricList list = new E_UsedGenricList();
		list.add("abc");
		list.add(1);
		list.add("ghi");
		list.prin();
	}
}
